import fr.iutvalence.java.tp.carunlocker.Position;
import fr.iutvalence.java.tp.carunlocker.Voiture;
import fr.iutvalence.java.tp.carunlocker.Direction.dir;


/**
 * (Pseudo) base de données des niveaux de jeu
 * @author lissonit
 */
public class Niveaux
{
	public static Voiture[] A()
	{
		Voiture[] listVoiture = new Voiture[8];
		listVoiture[0] = new Voiture(new Position(0,0), 3, dir.HORIZONTAL);
		listVoiture[1] = new Voiture(new Position(0,5), 3, dir.VERTICAL);
		listVoiture[2] = new Voiture(new Position(1,2), 3, dir.VERTICAL);
		listVoiture[3] = new Voiture(new Position(2,0), 2, dir.HORIZONTAL);
		listVoiture[4] = new Voiture(new Position(3,0), 2, dir.VERTICAL);
		listVoiture[5] = new Voiture(new Position(3,4), 2, dir.HORIZONTAL);
		listVoiture[6] = new Voiture(new Position(5,0), 3, dir.HORIZONTAL);
		listVoiture[7] = new Voiture(new Position(4,4), 2, dir.VERTICAL);
		
		return listVoiture;
	}
	
	public static Voiture[] B()
	{
		Voiture[] listVoiture = new Voiture[8];
		listVoiture[0] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[1] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[2] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[3] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[4] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[5] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[6] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		listVoiture[7] = new Voiture(new Position(0,0), 2, dir.HORIZONTAL);
		
		return listVoiture;
	}
}
