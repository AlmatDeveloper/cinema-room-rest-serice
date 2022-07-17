import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int unitsNum = scanner.nextInt();
        
        if (unitsNum < 1) {
            System.out.print("no army");
        } else if (unitsNum > 0 && unitsNum < 20) {
            System.out.print("pack");
        } else if (unitsNum > 19 && unitsNum < 250) {
            System.out.print("throng");
        } else if (unitsNum > 249 && unitsNum < 1000) {
            System.out.print("zounds");
        } else if (unitsNum > 999) {
            System.out.print("legion");
        }
    }
}
