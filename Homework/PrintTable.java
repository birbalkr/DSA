package Homework;

import java.awt.print.Printable;
import java.util.Scanner;

public class PrintTable {
    public static void Table(int num){

        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+ i+" "+ num*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num =sc.nextInt();
        Table(num);
    }
}
