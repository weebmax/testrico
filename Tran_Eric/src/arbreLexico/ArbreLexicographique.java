package arbreLexico;

public class ArbreLexicographique {
	private NoeudAbstrait entree;

	public ArbreLexicographique() {
		entree = NoeudVide.getUnique();
	}

	public boolean contient(String s) {
		return entree.contient(s);
	}

	public boolean prefixe(String s) {
		return entree.prefixe(s);
	}

	public int nbMots() {
		return entree.nbMots();
	}

	public boolean ajout(String s) {
		try {
			entree = entree.ajout(s);
		} catch (ModificationImpossibleException mie) {
			return false;
		}
		return true;
	}

	public boolean suppr(String s) {
		try {
			entree = entree.suppr(s);
		} catch (ModificationImpossibleException mie) {
			return false;
		}
		return true;
	}

	public String toString() {
		return entree.toString("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbreLexicographique arbre = new ArbreLexicographique();
		System.out.println(arbre.ajout("crash"));
		System.out.println(arbre.ajout("aile"));
		System.out.println(arbre.ajout("pilote"));
		System.out.println(arbre.ajout("piloter"));
		System.out.println(arbre.ajout("crash"));
		System.out.println(arbre.ajout("hélice"));
		System.out.println(arbre.ajout("pilote"));
		System.out.println(arbre.ajout("cockpit"));
		System.out.println(arbre.ajout("piston"));
		System.out.println("-------------");
		System.out.println(arbre);
		System.out.println("-------------");
		System.out.println("Nombre de mots : " + arbre.nbMots());
		System.out.println("aile ? " + arbre.contient("aile"));
		System.out.println("piston ? " + arbre.contient("piston"));
		System.out.println("voilier ? " + arbre.contient("voilier"));
		System.out.println("préfixe test ? " + arbre.prefixe("test"));
		System.out.println("préfixe pi ? " + arbre.prefixe("pi"));
		System.out.println("préfixe pil ? " + arbre.prefixe("pil"));
		System.out.println("suppression de pilote --> " + arbre.suppr("pilote"));
		System.out.println("suppression de piston --> " + arbre.suppr("piston"));
		System.out.println("suppression de piston --> " + arbre.suppr("piston"));
		System.out.println("suppression de soulier --> " + arbre.suppr("soulier"));		
		System.out.println("-------------");
		System.out.println(arbre);
		System.out.println("-------------");

	}

}
