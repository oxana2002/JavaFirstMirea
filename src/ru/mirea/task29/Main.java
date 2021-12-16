package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //попробуем воссоздать процесс сохранения игры и записи результато в файл, которых хранится в памяти компьютера
        //следует уточнить, что сериализация — это процесс сохранения состояния объекта в последовательность байт
        //поэтому в файл будет сохранена последовательность символов, а не связный текст
        //пример тестирования сериализации расположен ниже

        //создаем наш объект
        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

        CurrencyInfo savedGame = new CurrencyInfo(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        ObjectOutputStream objectOutputStream;
        try (FileOutputStream outputStream = new FileOutputStream("/Users/valera_kudryavtsev/Desktop/test.txt")) {
            objectOutputStream = new ObjectOutputStream(outputStream);
        }

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}