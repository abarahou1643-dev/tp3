public class MainEx3 {
    public static void main(String[] args) {
        AuteurEx3 hugo = new AuteurEx3("Victor Hugo");
        AuteurEx3 orwell = new AuteurEx3("George Orwell");

        LivreEx3 m1 = new LivreEx3("Les Miserables", hugo);
        LivreEx3 ndp = new LivreEx3("Notre-Dame de Paris", hugo);
        LivreEx3 l1984 = new LivreEx3("1984", orwell);

        BibliothequeEx3 centrale = new BibliothequeEx3("Centrale");
        BibliothequeEx3 quartier = new BibliothequeEx3("Quartier");

        centrale.ajouterLivre(m1);
        centrale.ajouterLivre(l1984);
        quartier.ajouterLivre(m1);
        quartier.ajouterLivre(ndp);

        System.out.println(hugo);
        hugo.getLivres().forEach(l -> System.out.println("  • " + l));

        System.out.println(orwell);
        orwell.getLivres().forEach(l -> System.out.println("  • " + l));

        System.out.println(centrale);
        centrale.getCollection().forEach(l -> System.out.println("  – " + l.getTitre()));

        System.out.println(quartier);
        quartier.getCollection().forEach(l -> System.out.println("  – " + l.getTitre()));
    }
}
