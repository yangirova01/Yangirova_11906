package homework;

import java.util.Scanner;

public class homework6 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        int k = 0;
        boolean Key = false;
        int i = 0;
        while (i < n) {
            char letter = scan.next().charAt(0);
            if (!Key) {
                k = letter - 'h';
                Key = true;
            }
            System.out.print((char)(letter - k));
            i++;
        }
    }
}

