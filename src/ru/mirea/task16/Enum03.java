package ru.mirea.task16;

enum Bank3 {
    Credit(9), Deposit(3), Hypothec(5), Loan(7), NewCard(2);

    //В переменной num хранится информация о процентах
    //либо переплаты, если речь идет, например, о кредите,
    //либо прибыли, если мы говорим о вкладе.
    //В случае банковской карты указывается процент ежемесячного кэшбэка.
    private int num;

    Bank3(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

public class Enum03 {
    public static void main(String[] args) {
        System.out.println("Операция " + Bank3.valueOf("Credit") + " в банке НеНаМели имеет процентную ставку "
                + Bank3.valueOf("Credit").getNum() + "%");

        System.out.println();
        for(Bank3 tmp : Bank3.values())
            System.out.println(tmp + " " + tmp.getNum());
    }
}