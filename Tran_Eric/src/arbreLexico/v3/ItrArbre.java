package arbreLexico.v3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItrArbre implements Iterator<String> {
    private String[] mots;
    private int position;
    
    public ItrArbre(ArbreLexicographique arbre) {
        // Récupérer tous les mots de l'arbre
        String contenu = arbre.toString();
        
        if (contenu.isEmpty()) {
            mots = new String[0];
        } else {
            // Séparer les mots (ils sont séparés par des retours à la ligne)
            mots = contenu.split("\n");
        }
        position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return position < mots.length;
    }
    
    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return mots[position++];
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove non supportée");
    }
}
