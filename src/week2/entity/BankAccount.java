package week2.entity;

import week2.NSFException;

public abstract class BankAccount {

    private int accNum;
    protected int balance;
    private static int count;


    public BankAccount() {
        this.accNum = count ++;
        this.balance = 0;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public abstract void withdrawal(int amount) throws NSFException;

    public int checkBalance(){
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
