package arbrebinaire;

public interface Visiteur {
	
	//public void visiterOperateurUnaire(OperateurUnaire operateurUnaire);
	//public void visiterOperateurBinaire(OperateurBinaire operateurBinaire);
	public void visiterNegation(Negation negation);
	public void visiterAddition(Addition addition);
	public void visiterMultiplication(Multiplication multiplication);
	public void visiterConstante(Constante constante);

}
