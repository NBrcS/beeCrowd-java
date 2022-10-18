import java.util.Scanner;

public class bee1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggest = Integer.MIN_VALUE;

        int count = 3;
        while(count > 0){
            int n = scanner.nextInt();

            if(n > biggest){
                biggest = n;
            }
            count--;
        }

        System.out.println(biggest + " eh o maior");

    }
}
