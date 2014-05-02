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
	public static final int LARGEUR = 6;
	
	/**
	 * La hauteur par défaut du plateau
	 */
	public static final int HAUTEUR = 6;
	
	/**
	 * la liste des voitures présentes sur le plateau
	 */
	private Voiture[] voitures;
	
	/**
	 * Un nouveau plateau non vide de largeur et de hauteur par défaut
	 * @param voitures La liste de voiture disponible sur le plateau 
	 */
	public Plateau(Voiture[] voitures)
	{	
		this.voitures = voitures;
	}
	
	/**
	 * Renvoi la liste de voiture
	 * @return Retourne la liste des voitures du plateau
	 */
	public Voiture[] obtenirVoitures()
	{
		return this.voitures;
	}
	
	
	/**
	 * Permet de savoir si la case indiquée est considérée comme un obstacle ou non
	 * @param position La position à tester
	 * @return boolean Retourne vrai si la position indiquée est un obstacle
	 */
	private boolean estLibre(Position position)
	{		
		for(Voiture voitureCourante : this.voitures)
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
			voiture.deplacerVers(positionSouhaitee);
		else
			System.out.println("Déplacement impossible\n"); // (TODO) DELETE !!!
	}
	
	/**
	 * Savoir si le déplacement d'une voiture vers une position est possible
	 * @param voiture La voiture à déplacer
	 * @param positionSouhaitee La position envisagée
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
		Voiture voitureApresMouvement = voiture.obtenirNouvelleVoitureParTranslation(positionFinale);
		
		for (Position position : voitureApresMouvement.obtenirPositions())
		 for (Voiture voitureDeLaListe : this.voitures)
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
	public boolean voiturePeutGlisserVersPosition(Voiture voiture, Position positionSouhaitee) // (TODO) private !
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
	 * @param position La position à tester
	 * @return boolean Retourne vrai si la position est disposée sur le plateau
	 */
	private boolean estDansPlateau(Position position)
	{
		if(position.obtenirX() >= 0 && position.obtenirX() < LARGEUR &&
				position.obtenirY() >= 0 && position.obtenirY() < HAUTEUR)
			return true;
		return false;
	}
}
