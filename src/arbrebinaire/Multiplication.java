package arbrebinaire;

public class Multiplication extends OperateurBinaire {

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public void accept(Visiteur visitor) {
		visitor.visiterMultiplication(this);
	}

}
