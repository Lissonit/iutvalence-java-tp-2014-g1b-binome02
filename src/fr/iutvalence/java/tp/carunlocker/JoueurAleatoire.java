package fr.iutvalence.java.tp.carunlocker;
import java.util.Random;


/**
 * Implémentation d'un joueur aléatoire
 * @author sebastienjean
 *
 */
public class JoueurAleatoire implements Joueur
{

	/**
	 * Le nombre de voitures sur le plateau
	 */
	private final int nombreDeVoitures;

	/**
	 * Création d'un nouveau joueur aléatoire
	 * @param nombreDeVoitures le nombre de voitures sur le plateau
	 */
	public JoueurAleatoire(int nombreDeVoitures)
	{
		this.nombreDeVoitures = nombreDeVoitures;
	}
	
	@Override
	public Mouvement obtenirMouvement()
	{
		Random generateurDeNombresAleatoires = new Random();
		int numeroDeLaVoiture = generateurDeNombresAleatoires.nextInt(this.nombreDeVoitures);
		Position position = new Position(generateurDeNombresAleatoires.nextInt(Plateau.LARGEUR),generateurDeNombresAleatoires.nextInt(Plateau.HAUTEUR));
		return new Mouvement(numeroDeLaVoiture, position);
	}

}
