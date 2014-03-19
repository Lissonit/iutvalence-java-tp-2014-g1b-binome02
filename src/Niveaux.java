import fr.iutvalence.java.tp.carunlocker.Position;
import fr.iutvalence.java.tp.carunlocker.Voiture;
import fr.iutvalence.java.tp.carunlocker.Direction;


/**
 * (Pseudo) base de données des niveaux de jeu
 * @author lissonit
 */
public class Niveaux
{
	public static Voiture[] A()
	{
		Voiture[] listVoiture = new Voiture[8];
		listVoiture[0] = new Voiture(new Position(0,0), 3, Direction.HORIZONTAL);
		listVoiture[1] = new Voiture(new Position(5,0), 3, Direction.VERTICAL);
		listVoiture[2] = new Voiture(new Position(2,1), 3, Direction.VERTICAL);
		listVoiture[3] = new Voiture(new Position(0,2), 2, Direction.HORIZONTAL);
		listVoiture[4] = new Voiture(new Position(0,3), 2, Direction.VERTICAL);
		listVoiture[5] = new Voiture(new Position(4,3), 2, Direction.HORIZONTAL);
		listVoiture[6] = new Voiture(new Position(0,5), 3, Direction.HORIZONTAL);
		listVoiture[7] = new Voiture(new Position(4,4), 2, Direction.VERTICAL);
		
		return listVoiture;
	}
	
	/* Exemple d'un second niveau */
	/*public static Voiture[] B()
	{
		Voiture[] listVoiture = new Voiture[8];
		listVoiture[0] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[1] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[2] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[3] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[4] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[5] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[6] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		listVoiture[7] = new Voiture(new Position(0,0), 2, Direction.HORIZONTAL);
		
		return listVoiture;
	}*/
}
