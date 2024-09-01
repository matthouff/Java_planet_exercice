package etapes;

public class Etape4_Incrementation {
    public static void exercice(){
        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int nbPlanetes=8;
        System.out.println(phrase);
        System.out.println(nbPlanetes);

        phrase="Il y a quelques années cependant, elles étaient au nombre de : ";
        nbPlanetes=++nbPlanetes;
        System.out.println(phrase);
        System.out.println(nbPlanetes);
    }
}
