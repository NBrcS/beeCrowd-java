import java.util.Scanner;

public class bee1002 {
    static final double PI = 3.14159;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        // Calculate area
        // Area = PI * radius^2
        double area = PI * Math.pow(radius, 2);

        System.out.printf("A=%.4f\n", area);
    }

}
