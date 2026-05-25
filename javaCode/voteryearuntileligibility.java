package javaCode;
import java.util.Scanner;

public class voteryearuntileligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        System.out.println(
                age >= 18
                        ? name + " is a valid voter."
                        : name + " is not a valid voter.\n" +
                                name + " will be eligible in " + (18 - age) + " years.");
    }
}
