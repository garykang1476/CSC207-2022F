package week2.bankingusecase;

import week2.NSFException;

public interface BankingInputBoundary {

    void saveMoney(int amount);

    void withdraw(int amount) throws NSFException;
}
