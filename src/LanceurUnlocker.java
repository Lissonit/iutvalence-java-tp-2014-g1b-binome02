import fr.iutvalence.java.tp.carunlocker.CarUnlocker;

/**
 * Lanceur de partie du jeu
 * @author lissonit
 */
public class LanceurUnlocker
{
	public static void main(String[] args)
	{
		System.out.println("création de le partie");
		CarUnlocker partieDeCarUnlocker = new CarUnlocker();
		System.out.println("démarage de le partie");
		partieDeCarUnlocker.jouer();
		System.out.println("fin de le partie");
	}
}
