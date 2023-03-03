package javabasic;

public class Avg {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        double sum = 0;
        int i = a;
        for (; i < b; i++) {
            sum = sum + i;
            i = i + 1;
        }
        double average = sum / i;
        System.out.println("Среднее арифметическое чисел = " + average);
    }
}