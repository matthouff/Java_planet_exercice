package oldMain;

import conqueteEspace.planete.PlaneteGazeuse;
import conqueteEspace.planete.PlaneteTellurique;
import conqueteEspace.vaisseau.TypeVaisseau;
import conqueteEspace.vaisseau.VaisseauCivil;
import conqueteEspace.vaisseau.VaisseauDeGuerre;

public class OldMain {
    public static void main(String[] args) {

//        ZONE EXERCICE
//        Etape11_While.exercice();


//        ZONE PLANET
        PlaneteTellurique mercure=new PlaneteTellurique("Mercure");
        mercure.diametre =4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;


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
//        System.out.println(Planete.nbPlanetesDecouvertes);


        // AJOUT DES CLASSES FILLES VaisseauDeGuerre et VaisseauCivil
        VaisseauDeGuerre chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;
        VaisseauCivil vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        VaisseauDeGuerre fregate1 = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate1.blindage = 4784;
        fregate1.resistanceDuBouclier = 30;
        fregate1.nbPassagers = 100;
        VaisseauDeGuerre fregate2 = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate2.blindage = 4784;
        fregate2.resistanceDuBouclier = 30;
        fregate2.nbPassagers = 14;


//        chasseur.activerBouclier();
//        vaisseauMonde.activerBouclier();
//
//        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);
//
//        vaisseauMonde.desactiverBouclier();

//        System.out.println("La résistance du bouclier du VM est " + vaisseauMonde.resistanceDuBouclier);
//        System.out.println("Le blindage du VM après attaque est de " + vaisseauMonde.blindage);

        // CRÉATION DES CLASSES "PlaneteTellurique", "PlaneteGazeuse" ET L'INTERFACE "Habitable"
//        mars.accueillirVaisseau(vaisseauMonde);
//        mars.accueillirVaisseau(chasseur);
//        chasseur.attaque(vaisseauMonde, "Gun", 2);

//        chasseur.activerBouclier();
//        chasseur.attaque(vaisseauMonde, "Gun", 2);
//        chasseur.desactiverBouclier();
//        chasseur.attaque(vaisseauMonde, "Gun", 2);


        // AJOUT DES CARGAISONS
        terre.accueillirVaisseau(chasseur);
        System.out.println("Cargaison refusé pour le vaisseau de type " + chasseur.type + " est " + chasseur.emporterCargaison(20) + " tonnes");
        terre.accueillirVaisseau(fregate1);
        System.out.println("Cargaison refusé pour le vaisseau de type " + fregate1.type + " est " + fregate1.emporterCargaison(45) + " tonnes");
        System.out.println("Cargaison refusé pour le vaisseau de type " + fregate1.type + " est " + fregate1.emporterCargaison(12) + " tonnes");
        terre.accueillirVaisseau(fregate2);
        System.out.println("Cargaison refusé pour le vaisseau de type " + fregate2.type + " est " + fregate2.emporterCargaison(30) + " tonnes");
        terre.accueillirVaisseau(vaisseauMonde);
        System.out.println("Cargaison refusé pour le vaisseau de type " + vaisseauMonde.type + " est " + vaisseauMonde.emporterCargaison(1560) + " tonnes");
        System.out.println("Cargaison refusé pour le vaisseau de type " + vaisseauMonde.type + " est " + vaisseauMonde.emporterCargaison(600) + " tonnes");




    }
}