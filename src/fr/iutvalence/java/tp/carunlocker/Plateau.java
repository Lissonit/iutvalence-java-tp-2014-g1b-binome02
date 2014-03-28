package fr.iutvalence.java.tp.carunlocker;


/**
 * Correspond a un environnement de jeu
 * @author lissonit
 */
public class Plateau
{
	/**
	 * La largeur par défaut du plateau de jeu
	 */
	private static final int LARGEUR_PLATEAU_DEFAULT = 6;
	
	/**
	 * La hauteur par défaut du plateau
	 */
	private static final int HAUTEUR_PLATEAU_DEFAULT = 6;
	
	/**
	 * La largeur du plateau
	 */
	private final int LARGEUR_PLATEAU;

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
	 * Permet de savoir si la case indiquée est considérée comme un obstacle ou non
	 * @param La position à tester
	 * @return Retourne vrai si la position indiquée est un obstacle
	 */
	private boolean estObstacle(Position position)
	{		
		for(Voiture voitureCourante : listVoiture)
			if(voitureCourante.occupePosition(position))
				return true;
		
		return false;
	}
	
	
	/**
	 * Savoir si le déplacement d'une voiture vers une position est possible
	 * @param La voiture à déplacer
	 * @param La position envisagée
	 * @return Retourne vrai si le déplacement vers la position envisagée est possible
	 */
	private boolean estDeplacementPossible(Voiture voiture, Position positionSouhaitee)
	{
		if(!this.estDansPlateau(positionSouhaitee))
			return false;
		// TODO Continuer la méthode
		return true;
	}
	
	/**
	 * Savoir si la position est disposée sur le plateau
	 * @param La position à tester
	 * @return Retourne vrai si la position est disposée sur le plateau
	 */
	private boolean estDansPlateau(Position position)
	{
		if(position.obtenirX() >= 0 && position.obtenirX() < this.LARGEUR_PLATEAU &&
				position.obtenirY() >= 0 && position.obtenirY() < this.HAUTEUR_PLATEAU)
			return true;
		return false;
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
