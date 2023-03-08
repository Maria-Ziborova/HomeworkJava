package javabasic;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int startRange = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int endRange = scanner.nextInt();
        int i = startRange;
        int count = 0;
        int countEven = 0;
        int sum = 0;
        int sumEven = 0;
        while (i <= endRange){
            if (i % 2 == 0) {
                sumEven += i;
                countEven += 1;
            }
            sum += i;
            count += 1;
            i++;
        }
        System.out.println("Среднее арифметическое = " + (double) sum / count);
        System.out.println("Среднее арифметическое четных = " + (double) sumEven / countEven);
    }
}
