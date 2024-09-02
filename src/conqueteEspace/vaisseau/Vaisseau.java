package conqueteEspace.vaisseau;

public abstract class Vaisseau {
    public String type;
    public int nbPassagers;
    public int blindage;
    public int resistanceDuBouclier;
    public int tonnageMax;
    public int tonnageActuel;


    Vaisseau(String type) {
        this.type = type;
    }


    public void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    public void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }

    public abstract int emporterCargaison(int cargaison); // Poids de la cargaison
}
