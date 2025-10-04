public class FiliereEx2 {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private EtudiantEx2[] etudiants;
    private int nbEtudiants;

    public FiliereEx2(String nom) {
        this.id = ++compteur;
        this.nom = nom;
        this.etudiants = new EtudiantEx2[5];
        this.nbEtudiants = 0;
    }

    public String getNom() { return nom; }

    public void ajouterEtudiant(EtudiantEx2 e) {
        if (nbEtudiants == etudiants.length) {
            EtudiantEx2[] tmp = new EtudiantEx2[etudiants.length * 2];
            System.arraycopy(etudiants, 0, tmp, 0, etudiants.length);
            etudiants = tmp;
        }
        etudiants[nbEtudiants++] = e;
        e.setFiliere(this);
    }

    public void afficherEtudiants() {
        System.out.println("Filiere " + nom + " (id=" + id + ") → " + nbEtudiants + " étudiants :");
        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("  • " + etudiants[i].getNom() + " " + etudiants[i].getPrenom());
        }
    }

    @Override
    public String toString() {
        return "Filiere[id=" + id + ", nom=" + nom + ", nbEtudiants=" + nbEtudiants + "]";
    }
}
