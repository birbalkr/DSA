package Homework;

import java.util.Scanner;

public class home2array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        int[] number = new int[row];

        for (int i = 0; i < row; i++) {
            number[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < row; j++) {

            if (number[j] > max) {
                max = number[j];
            }

            if (number[j] < min) {
                min = number[j];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
