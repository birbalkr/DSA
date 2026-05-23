import java.util.Scanner;

public class GratestBetweenTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(Math.max(num1, num2));

    }
}