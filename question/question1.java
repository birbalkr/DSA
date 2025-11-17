package question;

import java.util.Scanner;

public class question1 {
    // take 2 variables as input and print their sum.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
