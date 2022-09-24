package week2.presenter;

import week2.bankingusecase.BankingOutputBoundary;

public class BalanePresenter implements BankingOutputBoundary {
    @Override
    public void displayBalance(int amount) {
        System.out.println(amount);
    }
}
