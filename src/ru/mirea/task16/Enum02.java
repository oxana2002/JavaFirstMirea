package ru.mirea.task16;

enum Bank2 {
    Credit, Deposit, Hypothec, Loan, NewCard;
}

public class Enum02 {
    public static void main(String[] args) {
        Bank2 b;

        //Для перечисления используется функция values() и массив значений перечислимого типа
        System.out.println("Константы пречислимого типа Bank: ");
        Bank2 bb[] = Bank2.values();
        //Пробежимся по массиву для вывода значений в одну строку, разделяя пробелом
        for(Bank2 tmp : bb)
            System.out.println(tmp + " ");

        //Для перечисления используется функция values()
        //Массив значений перечислимого типа не используется
        System.out.println("\nКонстанты пречислимого типа Bank: ");
        //Пробежимся по массиву для вывода значений, каждое с новой строки
        for(Bank2 tmp : Bank2.values())
            System.out.println(tmp);
        System.out.println();

        //Метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        //передаваемым этому методу в виде символьной строки.
        b = Bank2.valueOf("Deposit");
        System.out.println("b = " + b);
    }
}