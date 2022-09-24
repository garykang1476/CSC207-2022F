package week2;


public class Knife implements Damagable {

    @Override
    public void makeDamage() {
        System.out.println("Hao teng hao teng!");
    }

    public void foo(){
        System.out.println("This is foo");
    }
}
