import java.util.Scanner;

public class GreetingMessageBaseonGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        System.out.print( gender.toLowerCase().equals("f") ? "Hello, Ma'am!" : gender.toLowerCase().equals("m")?"Hello, Sir!":"Hello Guest!");
    }
}
