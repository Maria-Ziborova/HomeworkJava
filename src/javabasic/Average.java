package javabasic;

public class Average {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        double sum = 0;
        double sum1 = 0;
        int i = a;
        int j = a;
        for (; i < b; i++) {
            sum = sum + i;
            i = i + 1;
        }
        for (; j < b; j++) {
            if (j % 2 == 0) {
                sum1 = sum1 + j;
                j = j + 1;
            }
        }
        double average = (double) sum / i;
        double average1 = (double) sum1 / j;
        System.out.println("Среднее арифметическое чисел = " + average);
        System.out.println("Среднее арифметическое четных чисел = " + average1);
    }
}
