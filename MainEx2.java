public class MainEx2 {
    public static void main(String[] args) {
        FiliereEx2 info = new FiliereEx2("Informatique");
        FiliereEx2 genie = new FiliereEx2("Genie Civil");

        EtudiantEx2 e1 = new EtudiantEx2("El Idrissi", "Mohamed");
        EtudiantEx2 e2 = new EtudiantEx2("Bentaleb", "Fatima");
        EtudiantEx2 e3 = new EtudiantEx2("Chouaib", "Youssef");

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);

        genie.ajouterEtudiant(new EtudiantEx2("Belkahia", "Khadija"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
    }
}
