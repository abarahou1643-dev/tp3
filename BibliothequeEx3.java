import java.util.HashSet;
import java.util.Set;

public class BibliothequeEx3 {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private Set<LivreEx3> collection = new HashSet<>();

    public BibliothequeEx3(String nom) {
        this.id = ++compteur;
        this.nom = nom;
    }

    public void ajouterLivre(LivreEx3 livre) {
        collection.add(livre);
    }

    public Set<LivreEx3> getCollection() { return collection; }

    @Override
    public String toString() {
        return "Bibliotheque[id=" + id + ", nom=" + nom + ", taille=" + collection.size() + "]";
    }
}
