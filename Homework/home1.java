//     Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.
// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

package Homework;

import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(
                " \n1 : + (Addition) \n 2 : - (Subtraction)\n 3 : * (Multiplication) \n 4 : / (Division) \n 5 : % (Modulo or remainder)");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("The sum is: " + (a + b));
                break;
            case 2:
                System.out.println("The Subtraction is: " + (a - b));
                break;
            case 3:
                System.out.println("The Multiplication is: " + (a * b));
                break;
            case 4:
                System.out.println("The Division is: " + (a / b));
                break;
            case 5:
                System.out.println("The remainder is: " + (a % b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

}