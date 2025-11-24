import java.util.Scanner;

public class Factorial {

    public static int FactorialNum(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        int result = FactorialNum(num);
        System.out.println("Factorial: " + result);
    }
}
