import java.util.ArrayList;
import java.util.List;

public class AuteurEx3 {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private List<LivreEx3> livres = new ArrayList<>();

    public AuteurEx3(String nom) {
        this.id = ++compteur;
        this.nom = nom;
    }

    public void ajouterLivre(LivreEx3 livre) {
        if (!livres.contains(livre)) {
            livres.add(livre);
        }
    }

    public List<LivreEx3> getLivres() { return livres; }

    @Override
    public String toString() {
        return "Auteur[id=" + id + ", nom=" + nom + ", nbLivres=" + livres.size() + "]";
    }
}
