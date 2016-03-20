import java.util.Scanner;

public class _06_SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        int max = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.printf("Sum from 1 to %d is: ", max);
        System.out.println(sum);
    }
}
