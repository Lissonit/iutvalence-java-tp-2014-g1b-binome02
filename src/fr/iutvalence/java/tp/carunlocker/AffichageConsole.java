package fr.iutvalence.java.tp.carunlocker;

public class AffichageConsole implements Affichage
{

	@Override
	public void afficherPlateau(Plateau plateau)
	{
		Voiture[] voitures = plateau.obtenirVoitures();
		String result = "";
		int[][] tableau = new int[Plateau.LARGEUR][Plateau.HAUTEUR];
		for (int indice = 0; indice < voitures.length; indice++)
		{
			Position posCour = voitures[indice].obtenirPositionDeLaTete();
			tableau[posCour.obtenirX()][posCour.obtenirY()] = indice + 1;

			switch (voitures[indice].obtenirDirection())
			{
			case VERTICAL:
				for (int y = 1; y < voitures[indice].obtenirTaille(); y++)
					tableau[posCour.obtenirX()][posCour.obtenirY() + y] = indice + 1;
				break;
			case HORIZONTAL:
				for (int x = 1; x < voitures[indice].obtenirTaille(); x++)
					tableau[posCour.obtenirX() + x][posCour.obtenirY()] = indice + 1;
				break;
			default:
				break;
			}
		}

		for (int hauteur = 0; hauteur < Plateau.LARGEUR; hauteur++)
		{
			for (int largeur = 0; largeur < Plateau.HAUTEUR; largeur++)
			{
				result += tableau[largeur][hauteur] + " ";
			}
			result += "\n";
		}
		System.out.println(result);
	}

	@Override
	public void afficherDebutTour(int numeroDuTour)
	{
		System.out.println("Tour " + numeroDuTour);
	}

	@Override
	public void afficherDemandeDeMouvement()
	{
		System.out.println("Mouvement ? ");
	}

	@Override
	public void afficherMouvement(Mouvement mouvement)
	{
		System.out.println("Déplacement de la voiture "
				+ mouvement.obtenirNumeroDeVoiture() + " vers "
				+ mouvement.obtenirNouvellePositionDeLaTete());
	}

}
