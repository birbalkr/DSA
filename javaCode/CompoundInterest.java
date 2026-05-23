import java.util.Scanner;

public class CompoundInterest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int P=sc.nextInt();
        double r = sc.nextDouble();
        int t =sc.nextInt();
        int n=sc.nextInt();

        double A =P*(Math.pow((1+r/n),(n*t)));
        double ci =A-P;
        System.out.print(String.format("%.2f", ci));
    }
}
