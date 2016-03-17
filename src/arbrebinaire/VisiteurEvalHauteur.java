package arbrebinaire;

public class VisiteurEvalHauteur implements Visiteur {
	
	private int hauteur;
	
	public VisiteurEvalHauteur() {
		hauteur = 0;
	}
	
	public void visiterNegation(Negation negation) {
		negation.getOpG().accept(this);
		hauteur++;
	}

	public void visiterAddition(Addition addition) {
		addition.getOpG().accept(this);
		int h1 = hauteur;
		addition.getOpD().accept(this);
		hauteur = max(h1, hauteur) + 1;
	}

	public void visiterMultiplication(Multiplication multiplication) {
		multiplication.getOpG().accept(this);
		int h1 = hauteur;
		multiplication.getOpD().accept(this);
		hauteur = max(h1, hauteur) + 1;
	}

	public void visiterConstante(Constante constante) {
		hauteur = 1;
	}
	
	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public int getHauteur() {
		return hauteur;
	}

}
