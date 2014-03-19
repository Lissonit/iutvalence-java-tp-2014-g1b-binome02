package fr.iutvalence.java.tp.carunlocker;


//TODO (fait) écrire un commentaire
/**
 * Correspond a un environnement de jeu
 * @author lissonit
 */
public class Plateau
{
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La largeur par défaut du plateau de jeu
	 */
	private static final int LARGEUR_PLATEAU_DEFAULT = 6;
	
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La hauteur par défaut du plateau
	 */
	private static final int HAUTEUR_PLATEAU_DEFAULT = 6;
	
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La largeur du plateau
	 */
	private final int LARGEUR_PLATEAU;

	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La hauteur du plateau
	 */
	private final int HAUTEUR_PLATEAU;
	
	/**
	 * la liste des voitures présentes sur le plateau
	 */
	private Voiture[] listVoiture;
	
	/**
	 * un nouveau plateau non vide de largeur et de hauteur par défaut
	 * @param listeVoiture
	 */
	public Plateau(Voiture[] listeVoiture)
	{
		// Initialisation de la taille du plateau crée
		this.LARGEUR_PLATEAU = LARGEUR_PLATEAU_DEFAULT;
		this.HAUTEUR_PLATEAU = HAUTEUR_PLATEAU_DEFAULT;
		
		this.listVoiture = listeVoiture;
	}
	
	/**
	 * retourne le plateau avec des voitures, représentés par des caractères
	 */
	public String toString()
	{
		try
		{
			String result = "";
			int[][] tableau = new int[LARGEUR_PLATEAU_DEFAULT][HAUTEUR_PLATEAU_DEFAULT];
			for(int indice = 0; indice < this.listVoiture.length; indice++)
			{
				Position posCour = this.listVoiture[indice].obtenirPosition();
				tableau[posCour.obtenirX()]
					   [posCour.obtenirY()] = indice + 1;
				
				switch(this.listVoiture[indice].obtenirDirection())
				{
					case VERTICAL:
						for(int y = 1; y < this.listVoiture[indice].obtenirTaille(); y++)
							tableau[posCour.obtenirX()][posCour.obtenirY() + y] = indice + 1;
						break;
					case HORIZONTAL:
						for(int x = 1; x < this.listVoiture[indice].obtenirTaille(); x++)
							tableau[posCour.obtenirX() + x][posCour.obtenirY()] = indice + 1;
						break;
					default:
						break;
				}
			}
		
			for(int hauteur = 0; hauteur < LARGEUR_PLATEAU_DEFAULT; hauteur++)
			{
				for(int largeur = 0; largeur < HAUTEUR_PLATEAU_DEFAULT; largeur++)
				{
					result += tableau[largeur][hauteur] + " ";
				}
				result += "\n";
			}
			
			return result;
		}
		catch(Exception e) { return "erreur : " + e.toString() + "\n"; }
	}
}
