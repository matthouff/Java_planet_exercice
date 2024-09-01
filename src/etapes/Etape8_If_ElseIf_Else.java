package etapes;

public class Etape8_If_ElseIf_Else {
    public static void exercice(){
        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes=0;
        short annee=1600;

        if (annee < 1600 || annee >= 2024){
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d", annee);
        }else{
            if(annee < 1700){
                nbPlanetes = 7;
            }else if(annee < 1800 || annee > 2006){
                nbPlanetes = 8;
            }else{
                nbPlanetes = 9;
            }

            System.out.printf(phraseIntroduction,annee,nbPlanetes);
        }
    }
}
