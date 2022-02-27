import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        double[] eqn = new double[3];
        double[] roots = new double[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < eqn.length; i++){
            eqn[i] = input.nextDouble();
        }
        int rootNum = solveQuadratic(eqn, roots);
        if (rootNum == 0) {
            System.out.println("The equation has no real roots.");
        }else if (rootNum == 1){
            System.out.printf("The equation has one root %.5f \n", roots[0]);
        }
        else System.out.printf("The equation has two roots %.5f and %.5f\n", roots[0],roots[1]);
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b,2) - 4.0 * a * c;
        if (discriminant > 0.0) {
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            return 2;
        } else if (discriminant == 0.0) {
            roots[0] = -b / (2.0 * a);
            return 1;
        }
        return 0;
    }
}

