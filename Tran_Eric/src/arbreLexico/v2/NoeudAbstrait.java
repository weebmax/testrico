package arbreLexico.v2;

public abstract class NoeudAbstrait {
	protected NoeudAbstrait frere;

	public NoeudAbstrait(NoeudAbstrait frere) {
		if (frere == null && (!(this instanceof NoeudVide)))
			throw new IllegalArgumentException("frere null interdit");
		this.frere = frere;
	}
	
	public abstract boolean contient(String s);
	public abstract boolean prefixe(String s);
	public abstract int nbMots();
	public abstract NoeudAbstrait ajout(String s) throws ModificationImpossibleException;
	public abstract NoeudAbstrait suppr(String s) throws ModificationImpossibleException;
	public abstract String toString(String s);

	public static void main(String[] args) {
//		NoeudAbstrait arbre = new Marque(null);
//		arbre = arbre.ajout("crash");
//		arbre = arbre.suppr("");
//		arbre = arbre.ajout("aile");
//		arbre = arbre.ajout("pilote");
//		arbre = arbre.ajout("piloter");
//		arbre = arbre.ajout("crash");
//		arbre = arbre.ajout("piston");
//		System.out.println("-------------");
//		System.out.println(arbre.toString(""));
//		System.out.println("-------------");
//		System.out.println("Nombre de mots : " + arbre.nbMots());
//		System.out.println("aile ? " + arbre.contient("aile"));
//		System.out.println("piston ? " + arbre.contient("piston"));
//		System.out.println("voilier ? " + arbre.contient("voilier"));
//		System.out.println("préfixe test ? " + arbre.prefixe("test"));
//		System.out.println("préfixe pi ? " + arbre.prefixe("pi"));
//		System.out.println("préfixe pil ? " + arbre.prefixe("pil"));
//		arbre = arbre.suppr("pilote");
//		arbre = arbre.suppr("piston");
//		System.out.println("-------------");
//		System.out.println(arbre.toString(""));
//		System.out.println("-------------");
//		System.out.println(arbre.toString());

	}

}
