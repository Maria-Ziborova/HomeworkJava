package javabasic;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int sumOdd = 0;
        int max = 0;
        while (a != 0) {
            sum += (a % 10);
            int b = a % 10;
            if (b % 2 == 1) {
                sumOdd += b;
            }
            if (b > max) {
                max = b;
            }
            a /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);
        System.out.println("Сумма нечетных цифр числа = " + sumOdd);
        System.out.println("Максимальная цифра числа = " + max);
    }
}
