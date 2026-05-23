import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(num%2==0?num +" is an even number":num +" is an odd number");
    }
}
