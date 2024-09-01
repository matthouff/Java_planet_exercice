package planets;

public class Planete {
    public String nom;
    public String matiere;
    public long diametre;
    public int totalVisiteurs;
    public Vaisseau vaisseauAccoste;
    public Atmosphere atmosphere;

    public static int nbPlanetesDecouvertes;
    public static String forme = "Sphérique";


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

    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){

        if (vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        }else{
            System.out.println("Un vaisseau de type "+ vaisseauAccoste.type +" doit s'en aller.");
        }

        totalVisiteurs += vaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent = vaisseauAccoste;
        vaisseauAccoste = vaisseau;

        return vaisseauPrecedent;
    }

    public static String expansion(double distance){
        return distance < 14 ? "Oh la la mais c'est super rapide !" : "Je rêve ou c'est plus rapide que la lumière ?";
    }

}
