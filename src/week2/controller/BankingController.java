package week2.controller;

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
}
