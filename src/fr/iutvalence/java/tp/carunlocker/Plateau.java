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
	 * Renvoi la liste de voiture
	 * @return Retourne la liste des voitures du plateau
	 */
	public Voiture[] obtenirListeVoitures()
	{
		return this.listVoiture;
	}
	
	
	/**
	 * Permet de savoir si la case indiquée est considérée comme un obstacle ou non
	 * @param La position à tester
	 * @return Retourne vrai si la position indiquée est un obstacle
	 */
	private boolean estLibre(Position position)
	{		
		for(Voiture voitureCourante : listVoiture)
			if(voitureCourante.occupePosition(position))
				return false;
		
		return true;
	}
	
	/**
	 * Effectue, si possible, un déplacement de la voiture vers la position souhaitée
	 * @param voiture La voiture à modifier
	 * @param positionSouhaitee La nouvelle position voulue pour la voiture
	 */
	public void deplacerVoiture(Voiture voiture, Position positionSouhaitee)
	{
		if(estDeplacementPossible(voiture,positionSouhaitee)) 
			voiture.modifierPosition(positionSouhaitee);
	}
	
	/**
	 * Savoir si le déplacement d'une voiture vers une position est possible
	 * @param La voiture à déplacer
	 * @param La position envisagée
	 * @return Retourne vrai si le déplacement de la tête vers la position envisagée est adjacente et possible
	 */
	private boolean estDeplacementPossible(Voiture voiture, Position positionSouhaitee)
	{
		if (!voiturePeutOccuperPosition(voiture, positionSouhaitee)) return false;
		if (!voiturePeutGlisserVersPosition(voiture, positionSouhaitee)) return false;
		return true;
	}
	
	/**
	 * Test si la voiture peut occuper la position final
	 * @param voiture Voiture à tester
	 * @param positionFinale Position à verifier en fonction de la voiture
	 * @return Retourne faux si une voiture occupe la position finale
	 */
	private boolean voiturePeutOccuperPosition(Voiture voiture, Position positionFinale)
	{
		Voiture voitureApresMouvement = voiture.translaterVers(positionFinale);
		
		for (Position position : voitureApresMouvement.obtenirPositions())
		 for (Voiture voitureDeLaListe : this.listVoiture)
		 {
			 if (voitureDeLaListe == voiture) continue;
			 if (voitureDeLaListe.occupePosition(position)) return false;
		 }
			
		return true;
	}


	/**
	 * Information : La position finale n'est pas à tester
	 * Test si le chemin est possible
	 * @param voiture Voiture à tester
	 * @param positionSouhaitee Position voulue 
	 * @return Retourne faux si le chemin entre la position de la voiture et la position souhaitée est occupée
	 */
	private boolean voiturePeutGlisserVersPosition(Voiture voiture, Position positionSouhaitee)
	{
		Position positionTete = voiture.obtenirPositionDeLaTete();
		Sens sens = positionTete.estAligneAvec(positionSouhaitee);
		if (sens == null) return false;
		if (sens.getDirection() != voiture.obtenirDirection()) return false;
	
		while (true)
		{
			Position positionSuivante = positionTete.obtenirVoisine(sens);
			positionTete = positionSuivante;
			if (positionSuivante.equals(positionSouhaitee)) return true;
			if (this.estLibre(positionSuivante)) continue;
			if (voiture.occupePosition(positionSuivante)) continue;	
			break;
		}
		return false;
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
				Position posCour = this.listVoiture[indice].obtenirPositionDeLaTete();
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
