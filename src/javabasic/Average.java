package javabasic;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int startRange = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int endRange = scanner.nextInt();
        int count = 0;
        int countEven = 0;
        int sum = 0;
        int sumEven = 0;
        while (startRange <= endRange){
            if (startRange % 2 == 0) {
                sumEven += startRange;
                countEven += 1;
            }
            sum += startRange;
            count += 1;
            startRange++;
        }
        System.out.println("Среднее арифметическое = " + (double) sum / count);
        System.out.println("Среднее арифметическое четных = " + (double) sumEven / countEven);
    }
}
