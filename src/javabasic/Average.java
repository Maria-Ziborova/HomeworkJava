package javabasic;

public class Average {
    public static void main(String[] args)
    {
        int i = 0;
        int j = 0;
        int a = 3;
        int b = 17;
        double sum = 0;
        double sum1 = 0;
        for(;a - b <= 0;)
        {
            i++;
            if (a % 2 == 0) { sum1 += a; j += 1; }
            sum += a;
            a += 1;
        }
        System.out.println("Среднее арифметическое чисел = " + sum / i);
        System.out.println("Среднее арифметическое четных чисел = " + sum1 / j);
    }
}
