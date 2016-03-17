package arbrebinaire;

public interface Visiteur {

	public void visiterNegation(Negation negation);
	public void visiterAddition(Addition addition);
	public void visiterMultiplication(Multiplication multiplication);
	public void visiterConstante(Constante constante);

}
