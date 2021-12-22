package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] clientsInfo = {"Казакова К.В.", "Степанов П.Г.", "Газманов Д.С."};
        String[] employeeInfo = {"Потапов Д.А.", "Петров Л.Х.", "Иванов С.Г."};
        String[] bankServicesInfo = {"Казакова К.В. взяла кредит на 500000 рублей, Баланс Степанов П.Г. составляет 780000 рублей, Депозит Газманов Д.С. составляет 3000000 рублей"};

        CurrencyInfo currencyInfo = new CurrencyInfo(clientsInfo, employeeInfo, bankServicesInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\oxana\\IdeaProjects\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\oxana\\IdeaProjects\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }
}
//Ответ
//CurrencyInfo{clientsInfo=[Казакова К.В., Степанов П.Г., Газманов Д.С.],
// employeeInfo=[Потапов Д.А., Петров Л.Х., Иванов С.Г.],
// bankServicesInfo=[Казакова К.В. взяла кредит на 500000 рублей, Баланс Степанов П.Г. составляет 780000 рублей, Депозит Газманов Д.С. составляет 3000000 рублей]}