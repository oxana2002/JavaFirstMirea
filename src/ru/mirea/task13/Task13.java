package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("ArrayList:");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("One"); // Добавление элемента
        arr.add("Three");
        arr.add(1, "Two"); // Добавление по индексу
        System.out.println("Массив: " + arr); // Вывод
        System.out.println("Размер массива: " + arr.size()); // Размер
        System.out.println("Индекс элемента 'Three': " + arr.indexOf("Three"));  // Получение индекса элемента
        System.out.println("Элемент с индексом 1: " + arr.get(1)); // Получение элемента по индексу
        if (!arr.isEmpty()) // Проверка на пустоту
            System.out.println("Массив не пустой");
        else
            System.out.println("Массив пуст");
        arr.remove("One"); // Удаление элемента
        arr.remove(0); // Удаление по индексу
        System.out.println("Массив: " + arr);
        arr.clear(); // Очистка

        System.out.println("\nLinkedList:");
        LinkedList<String> list = new LinkedList<>();
        list.add("One"); // Добавление элемента
        list.add("Three");
        list.add(1, "Two"); // Добавление по индексу
        System.out.println("Список: " + list); // Вывод
        System.out.println("Размер списка: " + list.size()); // Размер
        System.out.println("Индекс элемента 'Three': " + list.indexOf("Three"));  // Получение индекса элемента
        System.out.println("Элемент с индексом 1: " + list.get(1)); // Получение элемента по индексу
        if (!list.isEmpty()) // Проверка на пустоту
            System.out.println("Список не пустой");
        else
            System.out.println("Список пуст");
        list.remove("One"); // Удаление элемента
        list.remove(0); // Удаление по индексу
        System.out.println("Список: " + list);
        list.clear(); // Очистка

        System.out.println("\nMyArray:");
        MyArray<String> my_arr = new MyArray<>();
        my_arr.add("One"); // Добавление элемента
        my_arr.add("Three");
        my_arr.add(1, "Two"); // Добавление по индексу
        System.out.println("Массив: " + my_arr); // Вывод
        System.out.println("Размер массива: " + my_arr.size()); // Размер
        System.out.println("Индекс элемента 'Three': " + my_arr.indexOf("Three"));  // Получение индекса элемента
        System.out.println("Элемент с индексом 1: " + my_arr.get(1)); // Получение элемента по индексу
        if (!my_arr.isEmpty()) // Проверка на пустоту
            System.out.println("Массив не пустой");
        else
            System.out.println("Массив пуст");
        my_arr.remove("One"); // Удаление элемента
        my_arr.remove(0); // Удаление по индексу
        System.out.println("Массив: " + my_arr);
        my_arr.clear(); // Очистка
    }
}