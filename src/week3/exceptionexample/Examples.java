package week3.exceptionexample;

public class Examples {


    public static void foo(int num){
        if (num == 5){
            throw new MyRuntimeException();
        }
    }


    public static void boo(int num){
        if(num == 5){

            try {
                throw new MyException();
            }
            catch (MyException e){
                // DO Something.....
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args){
        foo(4);
        boo(3);
    }
}
