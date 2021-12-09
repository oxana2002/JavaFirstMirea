package ru.mirea.task14;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        Stack <Integer> first = new Stack<Integer>();
        Stack <Integer> second = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; ++i)
            first.add(sc.nextInt());

        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; ++i)
            second.add(sc.nextInt());

        System.out.println("Карточная колода у первого: " + first);
        System.out.println("Карточная колода у второго: " + second);
        int move = 0;
        boolean win = false;
        for (int i = 0, card1, card2; i < 106; ++i)
        {
            card1 = first.pop();
            card2 = second.pop();
            if ((card1 > card2) && (card1 != 9 && card2== 0) || (card1 == 0 && card2 == 9))

            {
                first.add(card1);
                first.add(card2);
            }
            else
            {
                second.add(card2);
                second.add(card1);
            }

            if (first.isEmpty())
            {
                System.out.println("second "+ Integer.toString(move + 1));
                win = true;
                break;
            }
            else if (second.isEmpty())
            {
                System.out.println("first "+ Integer.toString(move + (int)1));
                win = true;
                break;
            }
            move++;
        }

        if (!win)
        {
            System.out.println("draw " + move);
        }
    }
}