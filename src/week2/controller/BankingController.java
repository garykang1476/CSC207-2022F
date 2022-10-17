package week2.controller;

import week2.NSFException;
import week2.bankingusecase.BankingInputBoundary;

public class BankingController {
    private final BankingInputBoundary bankingInputBoundary;

    public BankingController(BankingInputBoundary bankingInputBoundary) {
        this.bankingInputBoundary = bankingInputBoundary;
    }

    public void saveMoney(int amount){  // trigger by UI
        bankingInputBoundary.saveMoney(amount);
        // ..... a lot more
    }

    public void withdrawMoney(int amount){
        try {
            bankingInputBoundary.withdraw(amount);
        } catch (NSFException e) {
            System.out.println("NSF....");
            withdrawMoney(amount - 100);
        }
    }
}
