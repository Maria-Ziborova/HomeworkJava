package Homework;

public class For {
    public static int multipleFour (int x) {
           return x % 4;
    }
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if ((multipleFour(i)) ==0){
                System.out.print(i + " ");
            }
        }
    }
}
