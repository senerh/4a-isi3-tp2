package arbrebinaire;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public void accept(Visiteur visitor) {
		visitor.visiterAddition(this);
	}

}
