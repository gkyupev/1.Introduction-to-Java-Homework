import java.util.Scanner;

public class _08_GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Set first number: ");
        double numA = console.nextDouble();
        System.out.print("Set second number: ");
        double numB = console.nextDouble();
        System.out.print("Set third number: ");
        double numC = console.nextDouble();

        System.out.printf("Average is: %.2f", average(numA, numB, numC));

    }
    private static double average(double numA, double numB, double numC) {
        return (numA + numB + numC) / 3;
    }
}
