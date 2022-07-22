import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long m = new Scanner(System.in).nextLong();
        long n = 1;
        long nFactorial = 1;

        while (m >= nFactorial) {
            n++;
            nFactorial *= n;
        }

        System.out.println(n);
    }
}