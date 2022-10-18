import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary * hours);
    }
}
