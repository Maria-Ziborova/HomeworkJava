package javabasic;

import static Homework.For.multipleFour;

public class ForNew {
    public static boolean multipleFour(int x) {
        if (x % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if ((multipleFour(i)) == true) {
                System.out.print(i + " ");
            }
        }
    }
}