package arbrebinaire;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		VisiteurAffichePostFixe visiteurPostFixe = new VisiteurAffichePostFixe();
		racine.accept(visiteurPostFixe);
		System.out.println(visiteurPostFixe.getExpression());
	}

	public int calculerValeur() {
		VisiteurEvalExpression visiteurCalcul = new VisiteurEvalExpression();
		racine.accept(visiteurCalcul); 
		return visiteurCalcul.getEvaluation();
	}

	public int calculerHauteur() {
		VisiteurEvalHauteur visiteurEvalHauteur = new VisiteurEvalHauteur();
		racine.accept(visiteurEvalHauteur);
		return visiteurEvalHauteur.getHauteur();
	}
	
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		VisiteurAfficheInFixe visiteurAfficheInfixe = new VisiteurAfficheInFixe();
		racine.accept(visiteurAfficheInfixe);
		System.out.println(visiteurAfficheInfixe.getExpression());
	}
	
}
