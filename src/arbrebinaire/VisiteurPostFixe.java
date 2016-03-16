package arbrebinaire;

public class VisiteurPostFixe implements Visiteur {
	
	private String expression;
	
	public VisiteurPostFixe() {
		expression = "";
	}
	
	public void visiterNegation(Negation negation) {
		negation.getOpG().accept(this);
		expression = expression + negation.getOp();
	}

	public void visiterAddition(Addition addition) {
		addition.getOpG().accept(this);
		addition.getOpD().accept(this);
		expression = expression + addition.getOp();
	}

	public void visiterMultiplication(Multiplication multiplication) {
		multiplication.getOpG().accept(this);
		multiplication.getOpD().accept(this);
		expression = expression + multiplication.getOp();
	}

	public void visiterConstante(Constante constante) {
		expression = expression + constante.getValeur();
	}
	
	public String getExpression() {
		return expression;
	}

}
