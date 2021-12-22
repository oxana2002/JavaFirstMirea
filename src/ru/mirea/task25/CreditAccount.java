package ru.mirea.task25;

public class CreditAccount extends SpecialAccount{
    public CreditAccount(BankAccount bankAcc){
        super(bankAcc, "Кредитный счёт", 8);
    }
}