package arbreLexico.v3;

public aspect Trace {
    
    pointcut constructionIterateur(ArbreLexicographique arbre) :
        execution(ItrArbre.new(ArbreLexicographique)) && args(arbre);
    
    after(ArbreLexicographique arbre) : constructionIterateur(arbre) {
        System.out.println("trace ---- Iterateur construit pour un arbre de taille " + arbre.nbMots());
    }
}
