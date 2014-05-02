import fr.iutvalence.java.tp.carunlocker.AffichageConsole;
import fr.iutvalence.java.tp.carunlocker.CarUnlocker;
import fr.iutvalence.java.tp.carunlocker.JoueurAleatoire;

/**
 * Lanceur de partie du jeu
 * @author lissonit
 */
public class LanceurUnlocker
{
	/**
	 * Application de démarrage d'une partie
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("création de la partie");
		CarUnlocker partieDeCarUnlocker = new CarUnlocker(Niveaux.A, new JoueurAleatoire(Niveaux.A.length), new AffichageConsole());
		System.out.println("démarage de la partie");
		partieDeCarUnlocker.jouer();
		System.out.println("fin de la partie");
	}
}
