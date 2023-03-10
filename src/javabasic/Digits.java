package javabasic;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Math.abs(scanner.nextInt());
        int sum = 0;
        int sumOdd = 0;
        int max = 0;
        while (inputDigit != 0) {
            sum += (inputDigit % 10);
            int addDigit = inputDigit % 10;
            if (addDigit % 2 == 1) {
                sumOdd += addDigit;
            }
            if (addDigit > max) {
                max = addDigit;
            }
            inputDigit /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);
        System.out.println("Сумма нечетных цифр числа = " + sumOdd);
        System.out.println("Максимальная цифра числа = " + max);
    }
}
