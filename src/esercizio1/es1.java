package esercizio1;

public class es1 {
    public static boolean stringaPariDispari(String target){
        return target.length() %2==0?true:false;
    }

    public static boolean annoBisestile(int anno){
        boolean ritorno = false;
        if(anno%4==0){
            ritorno = true;
        }
        if(anno%100 == 0 && anno%400 ==0){
            ritorno = true;
        }

        return  ritorno;
    }


}
