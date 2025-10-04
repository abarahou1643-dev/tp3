public class LivreEx3 {
    private static int compteur = 0;
    private final int id;
    private String titre;
    private AuteurEx3 auteur;

    public LivreEx3(String titre, AuteurEx3 auteur) {
        this.id = ++compteur;
        this.titre = titre;
        this.auteur = auteur;
        auteur.ajouterLivre(this);
    }

    public String getTitre() { return titre; }

    @Override
    public String toString() {
        return "Livre[id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
    }
}
