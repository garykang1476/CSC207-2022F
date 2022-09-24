package week2;

import week2.bankingusecase.BankingInputBoundary;
import week2.bankingusecase.BankingInteractor;
import week2.bankingusecase.BankingOutputBoundary;
import week2.controller.BankingController;
import week2.entity.SavingAccount;
import week2.presenter.BalanePresenter;

public class main {

    public static void main(String[] args) {
        BankingOutputBoundary bankingOutputBoundary = new BalanePresenter();
        BankingInputBoundary bankingInputBoundary = new BankingInteractor(bankingOutputBoundary,
                                                                            new SavingAccount());
        BankingController bankingController = new BankingController(bankingInputBoundary);

        // take user input into variable amount;
        int amount = 100;
        bankingController.saveMoney(amount);

    }

}
