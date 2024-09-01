import planets.Atmosphere;
import planets.Planete;
import planets.Vaisseau;

public class Main {
    public static void main(String[] args) {

//        ZONE EXERCICE
//        Etape11_While.exercice();


//        ZONE PLANET
        Planete mercure=new Planete("Mercure");
        mercure.matiere ="Tellurique";
        mercure.diametre =4880;
        Planete venus = new Planete("Venus");
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete("Terre");
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete("Mars");
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";


//        System.out.printf("%s a effectué %d tours complets autour de son étoile.%n", neptune.name, neptune.revolution(-3542));
//        System.out.printf("%s a effectué %d tours complets sur elle-même.%n", mars.name, mars.rotation(-684));
//        System.out.printf("%s a effectué %d tours complets sur elle-même.%n", venus.name, venus.rotation(1250));

//        mars.accueillirVaisseau(8);
//        mars.accueillirVaisseau("FREGATE");
//        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.", mars.name, mars.totalVisiteurs);


        // AJOUT DE LA CLASSE ATMOSPHERE
//        Atmosphere atmosphereUranus = new Atmosphere();
//        atmosphereUranus.tHydrogene = 83;
//        atmosphereUranus.tHelium = 15;
//        atmosphereUranus.tMethane = 2.5F;
//
//        uranus.atmosphere = atmosphereUranus;
//
//        System.out.printf("L'atmosphère de %s est composée :%n", uranus.nom);
//        System.out.println("A "+ uranus.atmosphere.tHydrogene +"% d'hydrogène");
//        System.out.println("A "+ uranus.atmosphere.tArgon +"% d'argon");
//        System.out.println("A "+ uranus.atmosphere.tDioxydeDeCarbone +"% de dioxyde de carbone");
//        System.out.println("A "+ uranus.atmosphere.tAzote +"% d'azote");
//        System.out.println("A "+ uranus.atmosphere.tHelium +"% d'hélium");
//        System.out.println("A "+ uranus.atmosphere.tMethane +"% de méthane");
//        System.out.println("A "+ uranus.atmosphere.tSodium +"% de sodium");


        // AJOUT DE LA CLASSE VAISSEAU
//        Vaisseau fregate = new Vaisseau();
//        fregate.type = "FREGATE";
//        fregate.nbPassagers = 9;
//        Vaisseau croiseur = new Vaisseau();
//        croiseur.type = "CROISEUR";
//        croiseur.nbPassagers = 42;
//
//        mars.accueillirVaisseau(fregate);
//        mars.accueillirVaisseau(croiseur);
//
//        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.", mars.nom, mars.totalVisiteurs);


        // AJOUT DE L'ATTRIBUT "STATIC" FORME
//        System.out.printf("La forme d'une planète est : %s%n", Planete.forme);
//        System.out.printf("La forme de %s est : %s", mars.nom, mars.forme);


        // AJOUT D'UNE MÉTHODE STATIC EXPANSION
//        System.out.println(Planete.expansion(14.2));


        // AJOUT DU PREMIER CONSTRUCTEUR POUR INCRÉMENTER LE NB DE PLANÈTE CONNUE (INSTANCIÉ)
        System.out.println(Planete.nbPlanetesDecouvertes);
    }
}