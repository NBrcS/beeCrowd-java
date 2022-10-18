import java.util.Scanner;

public class bee1011 {
    public static void main(String[] args) {

        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double volume = ((Math.pow(radius, 3) * PI) * 4) / 3;

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
