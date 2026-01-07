package arbreLexico.v3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public aspect ArbreCollection {
    
    declare parents: ArbreLexicographique implements Set<String>;
    
    // Méthode size()
    public int ArbreLexicographique.size() {
        return this.nbMots();
    }
    
    // Méthode isEmpty()
    public boolean ArbreLexicographique.isEmpty() {
        return this.nbMots() == 0;
    }
    
    // Méthode contains()
    public boolean ArbreLexicographique.contains(Object o) {
        if (!(o instanceof String)) {
            return false;
        }
        return this.contient((String) o);
    }
    
    // Méthode iterator()
    public Iterator<String> ArbreLexicographique.iterator() {
        return new ItrArbre(this);
    }
    
    // Méthode toArray()
    public Object[] ArbreLexicographique.toArray() {
        Object[] result = new Object[this.size()];
        int i = 0;
        for (String s : this) {
            result[i++] = s;
        }
        return result;
    }
    
    // Méthode toArray(T[])
    @SuppressWarnings("unchecked")
    public <T> T[] ArbreLexicographique.toArray(T[] a) {
        int size = this.size();
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(
                a.getClass().getComponentType(), size);
        }
        int i = 0;
        for (String s : this) {
            a[i++] = (T) s;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
    
    // Méthode add()
    public boolean ArbreLexicographique.add(String e) {
        return this.ajout(e);
    }
    
    // Méthode remove()
    public boolean ArbreLexicographique.remove(Object o) {
        if (!(o instanceof String)) {
            return false;
        }
        return this.suppr((String) o);
    }
    
    // Méthode containsAll()
    public boolean ArbreLexicographique.containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }
    
    // Méthode addAll()
    public boolean ArbreLexicographique.addAll(Collection<? extends String> c) {
        boolean modified = false;
        for (String s : c) {
            if (this.add(s)) {
                modified = true;
            }
        }
        return modified;
    }
    
    // Méthode retainAll()
    public boolean ArbreLexicographique.retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("retainAll non supportée");
    }
    
    // Méthode removeAll()
    public boolean ArbreLexicographique.removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            if (this.remove(o)) {
                modified = true;
            }
        }
        return modified;
    }
    
    // Méthode clear()
    public void ArbreLexicographique.clear() {
        throw new UnsupportedOperationException("clear non supportée");
    }
}
