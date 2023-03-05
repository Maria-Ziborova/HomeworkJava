package Homework;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int sum = 0;
            while(a !=0)

    {
        int b = a % 10;
        if (b % 2 == 1) {
            sum += b;
        }
        a /= 10;
    }
        System.out.println("Сумма нечетных цифр числа = "+sum);
    }
}
