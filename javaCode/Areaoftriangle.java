// Area Tringle Using Heron Fromula

// fromula:
// s=(a+b+c)/2
// Area=√(s(s-a)(s-b)(s-c))

import java.util.Scanner;

public class Areaoftriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(String.format("%.2f", area));
    }
}