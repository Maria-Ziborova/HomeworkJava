package javabasic;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int b = scanner.nextInt();
        int i = a;
        int j = a;
        int count = 0;
        int countEwen = 0;
        double sum = 0;
        double sumEven = 0;
        while (i <= b)
        {
            sum += i;
            count += 1;
            i++;
        }
        while (j <= b)
        {
            if (j % 2 == 0) {
                sumEven += j;
                countEwen += 1;
            }
            ++j;
        }
        System.out.println("Среднее арифметическое = " + sum / count);
        System.out.println("Среднее арифметическое четных = " + sumEven / countEwen);
    }
}
