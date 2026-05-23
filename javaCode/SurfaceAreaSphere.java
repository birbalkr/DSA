import java.util.Scanner;

public class SurfaceAreaSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double surfaceArea=4*Math.PI*(Math.pow(radius,2));
        System.out.println(surfaceArea);
    }
}
