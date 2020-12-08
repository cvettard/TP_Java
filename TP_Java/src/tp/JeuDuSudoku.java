package tp;

public class JeuDuSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoku jeuSudoku = new Sudoku();
		jeuSudoku.InitialisationGrille();
		
		IHM_Console utilisateur = new IHM_Console(jeuSudoku);
		
		while(!utilisateur.getJeuSudoku().getAGagne()) {
			utilisateur.AffichageGrille();
			utilisateur.SaisirChiffreEtCoordonneesCase();
		}
		System.out.println("Bravo, vous avez gagné !");
	}

}
