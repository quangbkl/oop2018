package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
