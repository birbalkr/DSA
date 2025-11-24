package Homework;

import java.util.Scanner;

public class Even_or_not {
    public static  boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check if it's even: ");

        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println(result);

        if(result){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }
}
