package ru.mirea.task10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class num10 {
    // Сумма цифр числа
    public static int sum(int n)
    {
        if (n / 10 == 0)
            return n;

        return n%10 + sum(n/10);
    }

    // Простое число
    public static boolean is_prime(int n, int div)
    {
        if (n == div)
            return true;
        if (n % div == 0)
            return false;

        return is_prime(n, div + 1);
    }

    // Печать простых множителей
    public static void print_number_factor(int n, int div)
    {
        if (n == 1)
            return;

        if (n % div == 0)
        {
            System.out.print(div + " ");
            print_number_factor(n/div, div);
        }
        else
        {
            print_number_factor(n, div+1);
        }

    }

    // Палиндром строки
    public static boolean palindrome(String str, int index)
    {
        if (index >= str.length()/2)
            return true;

        if (str.charAt(index) == str.charAt(str.length() - 1 - index))
            return palindrome(str, index + 1);

        return false;
    }

    // Без двух нулей
    public static int noneTwoZero(int zeros, int ones)
    {
        if (zeros - 1 > ones)
            return 0;

        if (zeros == 0 || ones == 0)
            return 1;

        if (zeros == 1)
            return ones + 1;
        else
            return noneTwoZero(zeros - 1, ones - 1) + noneTwoZero(zeros, ones - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 5");
        System.out.print("Введите число: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Сумма цифр числа " + n + ": " + sum(n));

        System.out.println("-------------------------------------------");
        System.out.println("Задание 6");
        System.out.print("Введите число: ");
        n = Integer.parseInt(sc.nextLine());
        if (is_prime(n, 2)){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание 7");
        System.out.print("Введите число: ");
        n = Integer.parseInt(sc.nextLine());
        print_number_factor(n, 2);
        System.out.println();

        System.out.println("-------------------------------------------");
        System.out.println("Задание 8");
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        if (palindrome(str, 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание 9");
        System.out.print("Введите количество 0 и 1 соответственно: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Количество возможных последовательностей: " + noneTwoZero(a, b));

    }
}