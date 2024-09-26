package conqueteEspace.vaisseau;

public abstract class Vaisseau {
    public TypeVaisseau type;
    public int nbPassagers;
    public int blindage;
    public int resistanceDuBouclier;
    public int tonnageMax;
    public int tonnageActuel;


    Vaisseau(TypeVaisseau type) {
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
