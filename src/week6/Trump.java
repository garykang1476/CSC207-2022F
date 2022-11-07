package week6;

public class Trump {

    private static Trump myDearTrump;

    private Trump(){

    }

    public static Trump getTrump(){
        if (myDearTrump == null){
            myDearTrump = new Trump();
        }
        return myDearTrump;
    }

}
