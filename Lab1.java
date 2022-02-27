import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan Amount: ");
        double Amount = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int Years = input.nextInt();
        System.out.println("Interest Rate\t"+"Monthly Payment\t"+"\tTotal Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            double MRate = i / 1200;
            double MPay = Amount * MRate/ (1 - 1 / Math.pow(1 + MRate, Years * 12));
            System.out.printf("%.3f%%" + "\t\t\t", i);
            System.out.printf("%-20.2f", MPay);
            System.out.printf("%.2f%n", (MPay * 12) * Years);
        }
    }
}
