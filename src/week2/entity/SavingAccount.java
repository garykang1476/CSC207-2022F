package week2.entity;


public class SavingAccount extends BankAccount{


    @Override
    public void withdrawal(int amount) {
        // setBalance(getBalance() - amount);
        if (balance - amount >= 0) {
            balance = balance - amount;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
