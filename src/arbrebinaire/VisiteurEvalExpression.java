package arbrebinaire;

public class VisiteurEvalExpression implements Visiteur {

	private int evaluation;
	
	public VisiteurEvalExpression() {
		evaluation = 0;
	}

	public void visiterNegation(Negation negation) {
		negation.getOpG().accept(this);
		evaluation = -evaluation;
	}

	public void visiterAddition(Addition addition) {
		addition.getOpG().accept(this);
		int opg = evaluation;
		addition.getOpD().accept(this);
		evaluation = opg + evaluation;
	}

	public void visiterMultiplication(Multiplication multiplication) {
		multiplication.getOpG().accept(this);
		int opg = evaluation;
		multiplication.getOpD().accept(this);
		evaluation = opg * evaluation;
	}

	public void visiterConstante(Constante constante) {
		evaluation = constante.getValeur();
	}
	
	public int getEvaluation() {
		return evaluation;
	}

}
