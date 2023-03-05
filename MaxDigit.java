package Homework;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int sum1 = 0;
        int max = 0;
        while (a != 0) {
            int b = a % 10;
            if (b > max) {
                max = b;
            }
            a /= 10;
        }
        System.out.println("Максимальная цифра числа = " + max);
    }
}
