import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        new Scanner(System.in).forEachRemaining(i -> System.out.print(Integer.parseInt(i) - 1 + " "));
    }
}