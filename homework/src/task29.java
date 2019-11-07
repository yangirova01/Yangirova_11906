import java.util.Scanner;

public class task29 {
    public static void readMatrix(int n, double[][] a, Scanner scan) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
    }

    public static void writeMatrix(int n, double[][] a, Scanner scan) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplytoScalar(int n, int b, double[][] a, Scanner scan) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] * b;
            }
        }
    }

    public static void MatrixAssign (double[][]a,double[][]b,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=b[i][j];
            }
        }
    }

    public static void multiply(int numofVert, double[][]a,double[][]b, Scanner scan,int n) {
        for(int i =0; i<n; i++){
            for(int j=0; j<0; j++){
                double[]row=a[i];
                double[]vertical= formVertical(j,a,n);
            }
        }
    }

    public static double[] formVertical( int numofVert, double[][]a, int n) {
        double[] vert = new double[n];
        for (int i = 0; i < n; i++) {
            vert[i] = a[i][numofVert];
        }
        return vert;
    }

    public static double countResult ( double []row, double[]vertical, int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += row[i] * vertical[i];
        }
        return result;
    }

}
