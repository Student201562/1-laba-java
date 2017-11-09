public class FibonacciJava {
    public static void main(String[] args) {
        int n = 1000;
        long a = 1, b = 1;
        System.out.print(a + " " + b);
        long fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}
