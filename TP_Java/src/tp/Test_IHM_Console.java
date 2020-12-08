package tp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class Test_IHM_Console {

	@Test
	void testSaisirChiffreEtCoordoneesCase() {
		Sudoku jeuSudoku = new Sudoku();
		jeuSudoku.initialisationGrille();
		
		IHM_Console utilisateur = new IHM_Console(jeuSudoku);
		
		assertEquals(utilisateur.getJeuSudoku().verificationLigne(1, 0),false);
		assertEquals(utilisateur.getJeuSudoku().verificationColonne(1, 0),false);
		assertEquals(utilisateur.getJeuSudoku().verificationLigne(2, 1),false);
		assertEquals(utilisateur.getJeuSudoku().verificationColonne(2, 2),false);
		assertEquals(utilisateur.getJeuSudoku().verificationLigne(3, 3),false);
		assertEquals(utilisateur.getJeuSudoku().verificationColonne(3, 1),false);
		assertEquals(utilisateur.getJeuSudoku().verificationLigne(4, 3),false);
		assertEquals(utilisateur.getJeuSudoku().verificationColonne(4, 3),false);
	}

}
