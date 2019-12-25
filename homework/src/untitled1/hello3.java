package untitled1;

import java.util.Scanner;

public class hello3 {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int i=0;
        int[] mas= new int[n];
        while(i<n){
            mas[i]=scan.nextInt();
            i++;
        }
        i=0;
        while(i<n/2){
            int a=mas[i];
            mas[i]=mas[n-i-1];
            mas[n-i-1]=a;
            i++;
        }
        i=0;
        System.out.println(mas[i]+"");
    }
}
