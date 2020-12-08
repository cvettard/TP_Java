package tp;

public class Case {

	private boolean estMasque;
	private int chiffre;
	
	public Case() {
		this.setEstMasque(true);
		this.setChiffre(0);
	}

	//Getters and Setters
	public int getChiffre() {
		return chiffre;
	}

	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}

	public boolean isEstMasque() {
		return estMasque;
	}

	public void setEstMasque(boolean estMasque) {
		this.estMasque = estMasque;
	}
}
