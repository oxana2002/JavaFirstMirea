package ru.mirea.task12;

import java.util.Arrays;

import java.lang.*;

public class Student {
    public static void main(String[] args) {
    int[]  iDNumber = {10, 2, 10, 3, 1, 2, 5};
System.out.println(Arrays.toString( iDNumber));
for (int left = 0; left <  iDNumber.length; left++) {
        // Вытаскиваем значение элемента
        int value =  iDNumber[left];
        // Перемещаемся по элементам, которые перед вытащенным элементом
        int i = left - 1;
        for (; i >= 0; i--) {
            // Если вытащили значение меньшее — передвигаем больший элемент дальше
            if (value <  iDNumber[i]) {
                iDNumber[i + 1] =  iDNumber[i];
            } else {
                // Если вытащенный элемент больше — останавливаемся
                break;
            }
        }
        // В освободившееся место вставляем вытащенное значение
    iDNumber[i + 1] = value;
    }
System.out.println(Arrays.toString( iDNumber));
}
}
