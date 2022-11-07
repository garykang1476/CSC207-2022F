package week2.namelookup;

import week2.entity.BankAccount;
import week2.entity.SavingAccount;

public class Demo {

    public static void main(String[] args) {
//        Apple apple = new Apple("Macintosh");
//        System.out.println(apple.numFruit);
//        System.out.println(((Fruit) apple).numFruit);
//        System.out.println(apple.name);
//        System.out.println(((Fruit) apple).name);


        BankAccount sa = new SavingAccount();
        sa.deposit(100);
//        sa.withdrawal(20);
    }
}
