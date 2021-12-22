package ru.mirea.task26;

public class Test {
    public static void main(String[] args) {
        Money eur = new EUR();
        Money kpw = new KPW();
        Money usd = new USD();

        eur.convers(3000);
        kpw.convers(3000);
        usd.convers(3000);

    }
}
//Перевод 3000.0 рублей в евро: 35.313
//        Неконвертируемая валюта
//        Перевод 3000.0 рублей в доллары: 39.690000000000005