package conqueteEspace.planete;

import conqueteEspace.Atmosphere;
import conqueteEspace.vaisseau.Vaisseau;

public abstract  class Planete {
    public static int nbPlanetesDecouvertes;
    public static String forme = "Sphérique";

    public String nom;
    public long diametre;
    public Atmosphere atmosphere;



    public Planete(String nom) {
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    public int revolution(int revolutions){
        return revolutions/360;
    }

    public int rotation(int rotations){
        return rotations/360;
    }

    public static String expansion(double distance){
        return distance < 14 ? "Oh la la mais c'est super rapide !" : "Je rêve ou c'est plus rapide que la lumière ?";
    }

}
