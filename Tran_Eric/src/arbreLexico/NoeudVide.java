package arbreLexico;

public class NoeudVide extends NoeudAbstrait {
	private static NoeudVide unique = new NoeudVide();

	private NoeudVide() {
		super(null);
	}
	
	public static NoeudVide getUnique() {
		return unique;
	}

	@Override
	public boolean contient(String s) {
		return false;
	}

	@Override
	public boolean prefixe(String s) {
		return false;
	}

	@Override
	public int nbMots() {
		return 0;
	}

	@Override
	public NoeudAbstrait ajout(String s) throws ModificationImpossibleException {
		NoeudAbstrait n = new Marque(this);
		for (int i = s.length() - 1; i >= 0; i --)
			n = new Noeud(this, n, s.charAt(i));	
		return n;
	}

	@Override
	public NoeudAbstrait suppr(String s) throws ModificationImpossibleException {
		throw new ModificationImpossibleException("suppression impossible");
	}

	@Override
	public String toString(String s) {
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
