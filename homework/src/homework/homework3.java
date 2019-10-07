package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       int a=scan.nextInt();
       int k=scan.nextInt();
       int i=0;
       int n=scan.nextInt();
       while (i<n){
           a=a-k;
           if (a<0){
               a=25+a;
           }else{
               a=a-k;
           }
       }
        System.out.println(a);
       }
}
