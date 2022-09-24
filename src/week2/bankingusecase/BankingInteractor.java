package week2.bankingusecase;

import week2.entity.BankAccount;

public class BankingInteractor implements BankingInputBoundary{

    private final BankingOutputBoundary bankingOutputBoundary;
    private BankAccount bankAccount;

    public BankingInteractor(BankingOutputBoundary bankingOutputBoundary, BankAccount bankAccount) {
        this.bankingOutputBoundary = bankingOutputBoundary;
        this.bankAccount = bankAccount;
    }

    @Override
    public void saveMoney(int amount) {
        bankAccount.deposit(amount);
        bankingOutputBoundary.displayBalance(bankAccount.checkBalance());

    }
}
