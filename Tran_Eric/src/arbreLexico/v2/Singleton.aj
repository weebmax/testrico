package arbreLexico.v2;

public aspect Singleton {
	private static NoeudVide NoeudVide.unique = new NoeudVide();
	
	private pointcut appelNouveauVide() : call(public NoeudVide.new()) && !(within(Singleton));
	
	NoeudVide around() : appelNouveauVide() {
		System.out.println("======================= point de jonction !!");
		return NoeudVide.unique;
	}
	
}
