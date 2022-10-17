package week2.entity;


import week2.NSFException;

public class SavingAccount extends BankAccount{


    @Override
    public void withdrawal(int amount) throws NSFException {
        // setBalance(getBalance() - amount);
        if (amount <= 0){
            throw new IllegalArgumentException();

        }
        if (balance - amount >= 0) {
            balance = balance - amount;   // 0
        }
        else {
            throw new NSFException();
        }

    }
}
