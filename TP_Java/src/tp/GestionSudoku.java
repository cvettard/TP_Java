package tp;

public interface GestionSudoku {

	public void InitialisationGrille();
	
	public boolean VerificationLigne(int chiffreSaisi, int ligneSaisi);
	
	public boolean VerificationColonne(int chiffreSaisi, int colonneSaisi);
	
	public boolean VerificationBloc(int chiffreSaisi, int ligneSaisi, int colonneSaisi);
	
	public boolean VerificationGagne();
	
	//EVOLUTION
	public boolean VerificationDiagonale(int chiffreSaisi, int ligneSaisi, int colonneSaisi);
	
	public void AideResolution();
}
