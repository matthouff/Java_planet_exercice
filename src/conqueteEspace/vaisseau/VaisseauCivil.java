package conqueteEspace.vaisseau;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(TypeVaisseau type) {
        super(type);
        switch (type){
            case CARGO -> tonnageMax = 500;
            case VAISSEAUMONDE -> tonnageMax = 2000;
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
