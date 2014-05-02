import fr.iutvalence.java.tp.carunlocker.Position;
import fr.iutvalence.java.tp.carunlocker.Voiture;
import fr.iutvalence.java.tp.carunlocker.Direction;


/**
 * (Pseudo) base de données des niveaux de jeu
 * @author lissonit
 */
public class Niveaux
{
	public final static Voiture[] A = 
			new Voiture[] {
							new Voiture(new Position(0,0), 3, Direction.HORIZONTAL),
							new Voiture(new Position(5,0), 3, Direction.VERTICAL),
							new Voiture(new Position(2,1), 3, Direction.VERTICAL),
							new Voiture(new Position(0,2), 2, Direction.HORIZONTAL),
							new Voiture(new Position(0,3), 2, Direction.VERTICAL),
							new Voiture(new Position(4,3), 2, Direction.HORIZONTAL),
							new Voiture(new Position(0,5), 3, Direction.HORIZONTAL),
							new Voiture(new Position(4,4), 2, Direction.VERTICAL)};
}
