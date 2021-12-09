package ru.mirea.task16;

enum Bank1 {
    Credit, Deposit, Hypothec, Loan, NewCard;
}

public class Enum01 {
    public static void main(String[] args) {
        Bank1 bnk = Bank1.Credit;

        System.out.println("Значение bnk: " + bnk + "\n");

        if(bnk == Bank1.Deposit)
            System.out.println("Переменная bnk содержит Deposit\n");
        else
            System.out.println("Переменная bnk не содержит Deposit\n");

        System.out.println("Условия операции, которую хранит переменная bnk:");
        switch (bnk) {
            case Credit:
                System.out.println("bnk содержит Credit. Процент по кредиту обсуждается индивидуально с каждым клиентом.");
                break;
            case Deposit:
                System.out.println("bnk содержит Deposit. Ежемесечная прибыль 3% для новых клиентов, 5% - для постоянных.");
                break;
            case Hypothec:
                System.out.println("bnk содержит Hypothec. Ипотека имеет фиксированную ставку 5% или 4,3% для льготных категорий граждан.");
                break;
            case Loan:
                System.out.println("bnk содержит Loan. Ссуда выдается минимум на 3 года, процент обсуждается индивидуально.");
                break;
            case NewCard:
                System.out.println("bnk содержит NewCard. Новая карта доступна всем клиентам абсолютно бесплатно.");
                break;
            default:
                System.out.println("Переменная bnk ничего не содержит.");
                break;
        }
    }
}