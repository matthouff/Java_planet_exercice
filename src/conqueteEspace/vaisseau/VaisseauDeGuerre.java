package conqueteEspace.vaisseau;

public class VaisseauDeGuerre extends Vaisseau {
    public boolean armesDesactivees = false;

    public VaisseauDeGuerre(String type) {
        super(type);
        switch (type){
            case "CHASSEUR" -> tonnageMax = 0;
            case "FREGATE" -> tonnageMax = 50;
            case "CROISEUR" -> tonnageMax = 100;
        }
    }

    public void desactiverArmes(){
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        armesDesactivees = true;
    }

    public void attaque(Vaisseau cible, String armeUtilise, int dureeAttaque){
        if(armesDesactivees){
            System.out.println("Attaque impossible, l'armement est désactivé");
        }else {
            System.out.printf(
                    "Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes.%n",
                    type,
                    cible.type,
                    armeUtilise,
                    dureeAttaque
            );
            cible.resistanceDuBouclier = 0;
            cible.blindage /= 2;
        }
    }

    public void activerBouclier(){
        super.activerBouclier();
        armesDesactivees = true;
        System.out.println("Armes désactivées");
    }

    public void desactiverBouclier(){
        super.desactiverBouclier();
        armesDesactivees = false;
        System.out.println("Armes activées");
    }

    @Override
    public int emporterCargaison(int cargaison) {
        if(type.equals("CHASSEUR")){
            return cargaison;
        }else{
            if(nbPassagers < 12){
                return cargaison;
            }else{
                int tonnagePassager = 2 * nbPassagers;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageAConsiderer = Math.min(tonnagePassager, tonnageRestant);

                if(cargaison > tonnageAConsiderer){
                    tonnageActuel = tonnageMax;
                    return cargaison - tonnageAConsiderer;
                }else{
                    tonnageActuel += cargaison;
                    return 0;
                }
            }
        }
    }
}
