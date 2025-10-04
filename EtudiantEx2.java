public class EtudiantEx2 {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private String prenom;
    private FiliereEx2 filiere;

    public EtudiantEx2(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setFiliere(FiliereEx2 f) {
        this.filiere = f;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    @Override
    public String toString() {
        String fil = (filiere != null) ? filiere.getNom() : "Aucune";
        return "Etudiant[id=" + id + ", nom=" + nom + ", prenom=" + prenom +
                ", filiere=" + fil + "]";
    }
}
