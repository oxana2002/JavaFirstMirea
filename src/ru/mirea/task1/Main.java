package ru.mirea.task1;

import java.lang.*;


public class Main {

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 9, 4, 23};
        int sum=0;
        int sum1=0;
        int sum2=0;
        int j=0;
        int y=0;
        for(int i=0; arr.length>i;i++){ //for
            sum=sum+arr[i];
        }
        System.out.println("Ответ через for: " + sum);
        while(arr.length>j){  //while
            sum1=sum1+arr[j];
            j++;
        }
        System.out.println("Ответ через while: " + sum1);
        do {
            sum2=sum2+arr[y];
            y++;
        }while (arr.length>y);
        System.out.println("Ответ через do while: " + sum2);
    }
}