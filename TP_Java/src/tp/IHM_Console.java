package tp;

import java.util.Scanner;

public class IHM_Console implements Affichage {

	private Sudoku jeuSudoku;
	
	public IHM_Console(Sudoku p_sudoku) {
		this.jeuSudoku=p_sudoku;
	}
	
	//Getters and Setters
	public Sudoku getJeuSudoku() {
		return this.jeuSudoku;
	}
	
	@Override
	public void SaisirChiffreEtCoordonneesCase() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int chiffreSaisi;
		int ligneSaisi;
		int colonneSaisi;
		
		System.out.println("Veuillez saisir un chiffre compris entre 0 et 3 :");
		chiffreSaisi = scan.nextInt();
		System.out.println("Entrez le numero de ligne :");
		ligneSaisi = scan.nextInt();
		System.out.println("Entrez le numero de colonne :");
		colonneSaisi = scan.nextInt();
		
		if(this.jeuSudoku.VerificationLigne(chiffreSaisi, ligneSaisi)
			&& this.jeuSudoku.VerificationColonne(chiffreSaisi, colonneSaisi)
			&& this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].getChiffre()==0) {
			this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].setChiffre(chiffreSaisi);
		}
		else {
			if(this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].getChiffre()!=0) {
				System.out.println("Cette case ne peut pas être modifié !");
			}
			else {
				System.out.println("Coordonées incorrect, doit être compris entre 0 et 3 !");
			}
			
		}
		scan.close();
		this.jeuSudoku.VerificationGagne();
	}

	@Override
	public void AffichageGrille() {
		// TODO Auto-generated method stub
		for(int iLigne=0; iLigne<this.jeuSudoku.getGrille().length;iLigne++) {
			for(int iColonne=0; iColonne<this.jeuSudoku.getGrille().length;iColonne++) {
				System.out.print(this.jeuSudoku.getGrille()[iLigne][iColonne].getChiffre()+" ");
			}
			System.out.println("");
		}
	}

}
