package conqueteEspace.planete;

import conqueteEspace.interfaces.Habitable;
import conqueteEspace.vaisseau.Vaisseau;
import conqueteEspace.vaisseau.VaisseauDeGuerre;

public class PlaneteTellurique extends Planete implements Habitable {
    public int totalVisiteurs;
    public Vaisseau vaisseauAccoste;


    public PlaneteTellurique(String nom) {
        super(nom);
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){

        if (vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        }else{
            System.out.println("Un vaisseau de type "+ vaisseauAccoste.type +" doit s'en aller.");
        }

        if(vaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }

        totalVisiteurs += vaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent = vaisseauAccoste;
        vaisseauAccoste = vaisseau;

        return vaisseauPrecedent;
    }

}
