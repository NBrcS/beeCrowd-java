import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();
        double liters = scanner.nextDouble();

        double consumption = km / liters;
        System.out.printf("%.3f km/l\n", consumption);
    }
}
