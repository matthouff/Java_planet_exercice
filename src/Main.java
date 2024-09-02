import conqueteEspace.Atmosphere;
import conqueteEspace.planete.Planete;
import conqueteEspace.planete.PlaneteGazeuse;
import conqueteEspace.planete.PlaneteTellurique;
import conqueteEspace.vaisseau.Vaisseau;
import conqueteEspace.vaisseau.VaisseauCivil;
import conqueteEspace.vaisseau.VaisseauDeGuerre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.tHydrogene= Float.valueOf(83f);
        atmosphereUranus.tHelium= Float.valueOf(15f);
        atmosphereUranus.tMethane=Float.valueOf(2.5f);
        atmosphereUranus.tAzote=Float.valueOf(0.0f);
        uranus.atmosphere=atmosphereUranus;

        System.out.printf("L'atmosphère de %s est composée :%n", uranus.nom);
        if(uranus.atmosphere.tHydrogene != null){
            System.out.println("A "+ uranus.atmosphere.tHydrogene +"% d'hydrogène");
        }
        if(uranus.atmosphere.tArgon != null){
            System.out.println("A "+ uranus.atmosphere.tArgon +"% d'argon");
        }
        if(uranus.atmosphere.tDioxydeDeCarbone != null){
            System.out.println("A "+ uranus.atmosphere.tDioxydeDeCarbone +"% de Dioxyde de carbone");
        }
        if(uranus.atmosphere.tAzote != null){
            System.out.println("A "+ uranus.atmosphere.tAzote +"% d'azote");
        }
        if(uranus.atmosphere.tHelium != null){
            System.out.println("A "+ uranus.atmosphere.tHelium +"% d'hélium");
        }
        if(uranus.atmosphere.tMethane != null){
            System.out.println("A "+ uranus.atmosphere.tMethane +"% d'méthane");
        }
        if(uranus.atmosphere.tSodium != null){
            System.out.println("A "+ uranus.atmosphere.tSodium +"% d'sodium");
        }



        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers = 5;
        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 30;
        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 150;
        Vaisseau cargo = new VaisseauCivil("CARGO");
        cargo.nbPassagers = 500;
        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 2000;

        System.out.println("Quel vaisseau veux tu piloter ? (CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAU-MONDE)");
        Scanner sc = new Scanner(System.in);
        String vaisseauPris = sc.nextLine();

        System.out.println("Sur quelle planète veux tu aller ? (Mercure, Venus, Terre, Mars)");
        sc = new Scanner(System.in);
        String planeteSelectionnee = sc.nextLine();

        System.out.println("Combien de tonnes de cargaison veux tu emmener ?");
        sc = new Scanner(System.in);
        int tonnage = sc.nextInt();

        Vaisseau vaisseau = null;
        PlaneteTellurique planete = null;

        switch (vaisseauPris){
            case "CHASSEUR" -> vaisseau = chasseur;
            case "FREGATE" -> vaisseau = fregate;
            case "CROISEUR" -> vaisseau = croiseur;
            case "CARGO" -> vaisseau = cargo;
            case "VAISSEAU-MONDE" -> vaisseau = vaisseauMonde;
        }
        switch (planeteSelectionnee){
            case "Mercure" -> planete = mercure;
            case "Venus" -> planete = venus;
            case "Terre" -> planete = terre;
            case "Mars" -> planete = mars;
        }

        planete.accueillirVaisseau(vaisseau);
        int rejet = vaisseau.emporterCargaison(tonnage);

        System.out.println("Le rejet de la cargaison est de " + rejet);
    }
}