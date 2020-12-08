package tp;

public class Sudoku implements GestionSudoku {

	private Case[][] grille;
	private boolean aGagne;
	
	public Sudoku() {
		this.grille = new Case[4][4];
		this.aGagne=false;
	}
	
	//Getters and Setters
	public Case[][] getGrille() {
		return this.grille;
	}

	public boolean getAGagne() {
		return this.aGagne;
	}

	/*
	 * Initialisation de la grille : créer les cases de la grille
	 * Saisi de certaines cases en dure car initialisation trop compliqué
	 */
	@Override
	public void initialisationGrille() {
		// TODO Auto-generated method stub
		
		//Initialise la grille avec des cases vide (contenant des zeros)
		for(int iLigne=0; iLigne<grille.length; iLigne++) {
			for(int iColonne=0; iColonne<grille[iLigne].length; iColonne++) {
				this.grille[iLigne][iColonne]= new Case();
			}
		}
		
		//Initialisation en dur de notre grille de 4x4
		this.grille[0][0].setChiffre(1);	this.grille[0][0].setEstMasque(false);
		
		this.grille[1][2].setChiffre(2);	this.grille[1][2].setEstMasque(false);
		
		this.grille[3][1].setChiffre(3);	this.grille[3][1].setEstMasque(false);
		
		this.grille[3][3].setChiffre(4);	this.grille[3][3].setEstMasque(false);
		
	}

	/*
	 * Vérifie que le chiffre saisi par l'utilisateur n'existe pas déjà dans cette ligne
	 * Si il existe déjà dans la ligne, renvoi faux et on redemande à l'utilisateur la saisi
	 */
	@Override
	public boolean verificationLigne(int chiffreSaisi, int ligneSaisi) {
		// TODO Auto-generated method stub
		boolean saisirChiffre=true;
		for(int iColonne=0; iColonne<this.grille.length;iColonne++) {
			if(this.grille[ligneSaisi][iColonne].getChiffre()==chiffreSaisi) {
				saisirChiffre=false;
			}
		}
		return saisirChiffre;
	}

	/*
	 * Vérifie que le chiffre saisi par l'utilisateur n'existe pas déjà dans cette colonne
	 * Si il existe déjà dans la colonne, renvoi faux et on redemande à l'utilisateur la saisi
	 */
	@Override
	public boolean verificationColonne(int chiffreSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		boolean saisirChiffre=true;
		for(int iLigne=0; iLigne<this.grille.length;iLigne++) {
			if(this.grille[iLigne][colonneSaisi].getChiffre()==chiffreSaisi) {
				saisirChiffre=false;
			}
		}
		return saisirChiffre;
	}

	/*
	 * Vérifie que le chiffre saisi par l'utilisateur n'existe pas déjà dans ce bloc
	 */
	@Override
	public boolean verificationBloc(int chiffreSaisi, int ligneSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		return false;
	}

	
	/*
	 * Vérifie si la parti est fini
	 * Si toutes les cases sont remplis (différentes de 0) alors la partie se termine
	 */
	@Override
	public void verificationGagne() {
		// TODO Auto-generated method stub
		boolean PasGagne = false;
		for(int iLigne=0; iLigne<this.grille.length;iLigne++) {
			for(int iColonne=0; iColonne<this.grille.length;iColonne++) {
				if(this.grille[iLigne][iColonne].getChiffre()==0) {
					PasGagne=true;
				}
			}
		}
		if(!PasGagne) {
			this.aGagne=true;
		}
	}

	/*
	 * Vérifie que le chiffre saisi par l'utilisateur n'existe pas déjà dans cette diagonale
	 */
	@Override
	public boolean verificationDiagonale(int chiffreSaisi, int ligneSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aideResolution() {
		// TODO Auto-generated method stub

	}

}
