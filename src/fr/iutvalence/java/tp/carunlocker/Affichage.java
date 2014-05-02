package fr.iutvalence.java.tp.carunlocker;

/**
 * Interface définissant le comportement attendu du mécanisme d'affichage de la partie
 * de CarUnlocker
 * @author sebastienjean
 *
 */
public interface Affichage
{
	/**
	 * Afficher le plateau
	 * @param plateau le plateau
	 */
	public void afficherPlateau(Plateau plateau);

	/**
	 * Afficher le début d'un tour
	 * @param numeroDuTour le numéro du tour
	 */
	public void afficherDebutTour(int numeroDuTour);

	/**
	 * Afficher la demande de mouvement
	 */
	public void afficherDemandeDeMouvement();

	/**
	 * Afficher le mouvement
	 * @param mouvement le mouvement
	 */
	public void afficherMouvement(Mouvement mouvement);
}
