package week2.namelookup;

import week2.entity.BankAccount;
import week2.entity.SavingAccount;

public class Fruit {

    public static int numFruit = 1;
    public String name;

    public Fruit(String name) {
        this.name = name;
        BankAccount ba = new SavingAccount();
    }
}
