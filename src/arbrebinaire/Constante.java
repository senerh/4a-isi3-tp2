package arbrebinaire;

public class Constante implements Noeud {
	private int valeur;
	
	public Constante(int v) {
		valeur = v;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public void accept(Visiteur visitor) {
		visitor.visiterConstante(this);
	}

}
