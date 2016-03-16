package arbrebinaire;

public class VisiteurCalcul implements Visiteur {

	private int expression;
	private int gauche;
	private int droite;
	
	public VisiteurCalcul() {
		expression = 0;
		gauche = 0;
		droite = 0;
	}

	public void visiterNegation(Negation negation) {
		//TODO: FAIRE CETTE CLASS
		negation.getOpG().accept(this);
		expression -= gauche;
	}

	public void visiterAddition(Addition addition) {
		addition.getOpG().accept(this);
		addition.getOpD().accept(this);
		expression = gauche + droite;
	}

	public void visiterMultiplication(Multiplication multiplication) {
		// TODO Auto-generated method stub

	}

	public void visiterConstante(Constante constante) {
		// TODO Auto-generated method stub

	}

}
