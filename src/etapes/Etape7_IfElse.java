package etapes;

public class Etape7_IfElse {
    static int nbPlanetes=0;
    static  String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
    static short annee=2006;

    public static void exercice(){
        if (annee>=2014){
            nbPlanetes=8;
        }else{
            nbPlanetes=9;
        }

        System.out.printf(phraseIntroduction,annee,nbPlanetes);
    }
}
