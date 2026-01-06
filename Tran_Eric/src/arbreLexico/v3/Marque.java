package arbreLexico.v3;

public class Marque extends NoeudAbstrait {

	public Marque(NoeudAbstrait frere) {
		super(frere);
	}

	@Override
	public boolean contient(String s) {
		return s.isEmpty() || frere.contient(s);
	}

	@Override
	public boolean prefixe(String s) {
		if (s.isEmpty())
			return true;
		return frere.prefixe(s);
	}

	@Override
	public int nbMots() {
		return 1 + frere.nbMots();
	}

	@Override
	public NoeudAbstrait ajout(String s) throws ModificationImpossibleException {
		if (s.isEmpty())
			throw new ModificationImpossibleException("ajout impossible");
		frere = frere.ajout(s);
		return this;
	}

	@Override
	public NoeudAbstrait suppr(String s) throws ModificationImpossibleException {
		if (s.isEmpty())
			return frere;
		frere = frere.suppr(s);
		return this;
	}

	@Override
	public String toString(String s) {
		return s + '\n' + frere.toString(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
