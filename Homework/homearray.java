package Homework;

import java.util.Scanner;

public class homearray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        int[] numbers = new int[row];

        for(int i=0; i<row; i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0; i<row; i++){
            System.out.print(" "+ numbers[i]);
        }
    }
}
