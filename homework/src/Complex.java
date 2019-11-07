import java.util.Scanner;
public class Complex {
    static Scanner scan = new Scanner(System.in);

    public static double[] readComplex() {
        double realPart = scan.nextDouble();
        double mnemoPart = scan.nextDouble();
        return formComplex(realPart, mnemoPart);
    }

    public static double[] formComplex(double realPart, double mnemoPart) {
        double[] result = new double[2];
        return null;
    }
}
