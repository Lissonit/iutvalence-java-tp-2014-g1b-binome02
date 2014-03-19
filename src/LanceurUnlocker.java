import fr.iutvalence.java.tp.carunlocker.CarUnlocker;

/**
 * Lanceur de partie du jeu
 * @author lissonit
 */
public class LanceurUnlocker
{
	
	// TODO (fait) écrire un commentaire
	/**
	 * Application de démarrage d'une partie
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("création de la partie");
		CarUnlocker partieDeCarUnlocker = new CarUnlocker(Niveaux.A());
		System.out.println("démarage de la partie");
		partieDeCarUnlocker.jouer();
		System.out.println("fin de la partie");
	}
}
