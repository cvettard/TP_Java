package tp;

public interface GestionSudoku {

	public void initialisationGrille();
	
	public boolean verificationLigne(int chiffreSaisi, int ligneSaisi);
	
	public boolean verificationColonne(int chiffreSaisi, int colonneSaisi);
	
	public boolean verificationBloc(int chiffreSaisi, int ligneSaisi, int colonneSaisi);
	
	public void verificationGagne();
	
	//EVOLUTION
	public boolean verificationDiagonale(int chiffreSaisi, int ligneSaisi, int colonneSaisi);
	
	public void aideResolution();
}
