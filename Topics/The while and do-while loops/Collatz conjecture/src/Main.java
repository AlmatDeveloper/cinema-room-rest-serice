import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        while (num != 1) {
            System.out.print(num + " ");

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }

        System.out.print(1);
    }
}