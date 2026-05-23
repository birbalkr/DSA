import java.util.Scanner;

public class validVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        System.out.println(age>=18?"Hello "+name+", you are a valid voter":"Hello "+name+", you will be eligible to vote in age-18 year ");
    }
}
