import java.util.Scanner;

public class tasKhad {
    public static void writeArray(int[]a, int n, Scanner scan) {
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
    }
    public static void writeArray(int[]b, int n){
        for (int i=0; i<n; i++){
            System.out.println(b[i]);
            System.out.println("");
        }
    }
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        
    }
}
