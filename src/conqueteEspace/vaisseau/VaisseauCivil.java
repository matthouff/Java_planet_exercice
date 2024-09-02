package conqueteEspace.vaisseau;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(String type) {
        super(type);
        switch (type){
            case "CARGO" -> tonnageMax = 500;
            case "VAISSEAU-MONDE" -> tonnageMax = 2000;
        }
    }

    @Override
    public int emporterCargaison(int cargaison) {
        int surplus = tonnageMax - tonnageActuel;

        if(cargaison > surplus){
            tonnageActuel = tonnageMax;
            return cargaison - surplus;
        }else{
            tonnageActuel += cargaison;
            return 0;
        }
    }
}
