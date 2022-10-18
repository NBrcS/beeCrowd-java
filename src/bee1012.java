import java.util.Scanner;

public class bee1012 {
    public static void main(String[] args) {

        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(),
                b = scanner.nextDouble(),
                c = scanner.nextDouble();

        double triangle = (a * c) / 2,
                circle = PI * Math.pow(c, 2),
                trapeze = ((a + b) * c) / 2,
                square = b * b,
                rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f\n" +
                            "CIRCULO: %.3f\n" +
                            "TRAPEZIO: %.3f\n" +
                            "QUADRADO: %.3f\n" +
                            "RETANGULO: %.3f\n",
                triangle, circle, trapeze, square, rectangle);

    }
}
