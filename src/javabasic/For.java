package javabasic;

public class For {
    public static boolean multipleFour(int x) {
        if (x % 4 == 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (multipleFour(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
