import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double sold = scanner.nextDouble();

        double total = fixedSalary + (sold * (15.0/100));
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
