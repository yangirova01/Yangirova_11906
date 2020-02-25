package AiSD;
import java.util.Scanner;

public class Classwork1 {
    private long length;
    private int[] digits;
    public void multiply(int a, int b){
        while(a!=0){
            int k = 0;
            int temp = a % 10;
        for(int i = 0; i< this.length; i++){
            this.digits[i] *= temp;
            if(this.digits[i]>9){
                this.digits[i+1]= this.digits[i+1]+this.digits[i]/10;
            }
            }
        }
    }
    public void main(String[] args){
        Scanner scan = new Scanner (System.in);
        for (int i =0; i < this.length; i++){
        }
    }
}
