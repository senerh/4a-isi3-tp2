package arbrebinaire;

public class VisiteurAfficheInFixe implements Visiteur {
	
	private String expression;
	private int priorite;
	
	public VisiteurAfficheInFixe() {
		expression = "";
		priorite = 0;
	}
	
	public void visiterNegation(Negation negation) {
		negation.getOpG().accept(this);
		if (priorite == 1) {
			expression = "(" + expression + ")";
		}
		expression = negation.getOp() + expression;
		priorite = 1;
	}

	public void visiterAddition(Addition addition) {
		addition.getOpG().accept(this);
		String expressionOpG = expression;
		int prioriteOpG = priorite;
		addition.getOpD().accept(this);
		
		if (prioriteOpG == 1) {
			expressionOpG = "(" + expressionOpG + ")";
		}
		if (priorite == 1) {
			expression = "(" + expression + ")";
		}
		
		expression = expressionOpG + addition.getOp() + expression;
		priorite = 2;
	}

	public void visiterMultiplication(Multiplication multiplication) {
		multiplication.getOpG().accept(this);
		String expressionOpG = expression;
		int prioriteOpG = priorite;
		multiplication.getOpD().accept(this);
		
		if (prioriteOpG == 1 || prioriteOpG == 2) {
			expressionOpG = "(" + expressionOpG + ")";
		}
		if (priorite == 1 || priorite == 2) {
			expression = "(" + expression + ")";
		}
		
		expression = expressionOpG + multiplication.getOp() + expression;
		priorite = 3;
	}

	public void visiterConstante(Constante constante) {
		expression = "" + constante.getValeur();
		priorite = 0;
	}
	
	public String getExpression() {
		return expression;
	}

}
