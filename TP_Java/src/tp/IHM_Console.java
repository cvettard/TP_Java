package tp;

import java.util.Scanner;

public class IHM_Console implements Affichage {

	private Sudoku jeuSudoku;
	private static Scanner scan = new Scanner(System.in);
	public IHM_Console(Sudoku p_sudoku) {
		this.jeuSudoku=p_sudoku;
	}
	
	//Getters and Setters
	public Sudoku getJeuSudoku() {
		return this.jeuSudoku;
	}
	
	/*
	 * Demande � l'utilisateur un chiffre � rentrer dans la grille ainsi que les coordonn�es (abscisse + ordonn�e) qui doivent correspondre aux crit�res de la grille
	 * Ensuite on effectue les v�rifications par rapport � la grille avec les m�thodes de la classe Sudoku (verificationLigne, verificationColonne) 
	 * 
	 * 
	 * Notes pour moi m�me :
	 * Il faudrait s�parer cette m�thode en plusieurs sous m�thodes (saisi du chiffre, saisi de l'abscisse, saisi de l'ordonn�e, v�rifications �tape par �tape
	 */
	@Override
	public void saisirChiffreEtCoordonneesCase() {
		// TODO Auto-generated method stub
		int chiffreSaisi=-1;
		int ligneSaisi=-1;
		int colonneSaisi=-1;

		//Saisi du chiffre � rentrer dans le sudoku (doit �tre compris entre 1 et 4)
		while(chiffreSaisi<1 || chiffreSaisi>4) {
			System.out.println("Saisir un chiffre compris entre 1 et 4 :");
			try {
				chiffreSaisi = scan.nextInt();
			}
			catch(Exception e) {
				scan.nextLine();
			}
		}
		
		//Saisi de l'abscisse (doit �tre compris entre 0 et 3)
		while(ligneSaisi<0 || ligneSaisi>3) {
			System.out.println("Entrez le numero de ligne (compris entre 0 et 3) :");
			try {
				ligneSaisi = scan.nextInt();
			}
			catch(Exception e) {
				scan.nextLine();
			}
		}
		
		//Saisi de l'ordonn�e (doit �tre compris entre 0 et 3)
		while(colonneSaisi<0 || colonneSaisi>3) {
			System.out.println("Entrez le numero de colonne (compris entre 0 et 3) :");
			try {
				colonneSaisi = scan.nextInt();
			}
			catch(Exception e) {
				scan.nextLine();
			}
		}
		
		//Effectue les v�rification pour savoir si l'on peut entrer ce chiffre ou non dans la grille
		if(this.jeuSudoku.verificationLigne(chiffreSaisi, ligneSaisi)
			&& this.jeuSudoku.verificationColonne(chiffreSaisi, colonneSaisi)
			&& this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].getChiffre()==0) {
			this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].setChiffre(chiffreSaisi);
		}
		else {
			if(this.jeuSudoku.getGrille()[ligneSaisi][colonneSaisi].getChiffre()!=0) {
				System.out.println("Cette case ne peut pas �tre modifi� !");
			}
			else {
				if(!this.jeuSudoku.verificationLigne(chiffreSaisi, ligneSaisi)) {
					System.out.println("Il y a d�j� un "+chiffreSaisi+" dans cette ligne !");
				}
				else {
					if(!this.jeuSudoku.verificationColonne(chiffreSaisi, colonneSaisi)){
						System.out.println("Il y a d�j� un "+chiffreSaisi+" dans cette colonne !");
					}
				}
			}
			
		}
	}

	/*
	 * Affiche la grille du Sudoku, les zeros sont des cases vides
	 */
	@Override
	public void affichageGrille() {
		System.out.println("\n***********");
		// TODO Auto-generated method stub
		for(int iLigne=0; iLigne<this.jeuSudoku.getGrille().length;iLigne++) {
			System.out.print("* ");
			for(int iColonne=0; iColonne<this.jeuSudoku.getGrille().length;iColonne++) {
				System.out.print(this.jeuSudoku.getGrille()[iLigne][iColonne].getChiffre()+" ");
			}
			System.out.print("*\n");
		}
		System.out.println("***********\n");
	}

}
