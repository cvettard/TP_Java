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

	@Override
	public void InitialisationGrille() {
		// TODO Auto-generated method stub
		
		//Initialize la grille avec des case vide (contenant des zeros)
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

	@Override
	public boolean VerificationLigne(int chiffreSaisi, int ligneSaisi) {
		// TODO Auto-generated method stub
		boolean saisirChiffre=true;
		for(int iColonne=0; iColonne<this.grille.length;iColonne++) {
			if(this.grille[ligneSaisi][iColonne].getChiffre()==chiffreSaisi) {
				saisirChiffre=false;
			}
		}
		return saisirChiffre;
	}

	@Override
	public boolean VerificationColonne(int chiffreSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		boolean saisirChiffre=true;
		for(int iLigne=0; iLigne<this.grille.length;iLigne++) {
			if(this.grille[iLigne][colonneSaisi].getChiffre()==chiffreSaisi) {
				saisirChiffre=false;
			}
		}
		return saisirChiffre;
	}

	@Override
	public boolean VerificationBloc(int chiffreSaisi, int ligneSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void VerificationGagne() {
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

	@Override
	public boolean VerificationDiagonale(int chiffreSaisi, int ligneSaisi, int colonneSaisi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void AideResolution() {
		// TODO Auto-generated method stub

	}

}
