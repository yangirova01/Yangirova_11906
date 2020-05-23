package AiSDHomework;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TaskA {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int l;
        if(s>n){
            l=s;
        } else{
            l=n;
        }
        int[][] arrayB1 = new int[l][2];
        int[][] arrayS1 = new int[l][2];
        int a = 0;
        int b = 0;
        for (int i=0;i<l;i++){
            for (int j=0;j<2;j++) {
                arrayB1[i][j] = -1000;
                arrayS1[i][j] = -1000;
            }
        }
        for(int i = 0;i<n;i++){
            String[] str=scan.nextLine().split(" ");
            if(str[0].equals("B")){
                arrayB1[a][0]=Integer.parseInt(str[1]);
                arrayB1[a][1]=Integer.parseInt(str[2]);
                a++;
            }
            else {
                arrayS1[b][0] = Integer.parseInt(str[1]);
                arrayS1[b][1] = Integer.parseInt(str[2]);
                b++;
            }
        }
        int m;
        if(a>b){
            m=a;
        }
        else m=b;

        for (int i = 0;i<m;i++){
            for (int j = i+1;j<m;j++) {
                if (arrayB1[i][0] == arrayB1[j][0]){
                    arrayB1[i][1]+=arrayB1[j][1];
                    arrayB1[j][0]=-1000;
                    arrayB1[j][1]=-1000;
                }
                if (arrayS1[i][0] == arrayS1[j][0]){
                    arrayS1[i][1]+=arrayS1[j][1];
                    arrayS1[j][0]=-1000;
                    arrayS1[j][1]=-1000;
                }
            }
        }
        int count=0;
        for (int i=0;i<m;i++){
            for (int j=i+1;j<l;j++){
                int r,d;
                if(arrayB1[j][0]>arrayB1[i][0]){
                    r=arrayB1[i][1];
                    d=arrayB1[i][0];
                    arrayB1[i][1]=arrayB1[j][1];
                    arrayB1[j][1]=r;
                    arrayB1[i][0]=arrayB1[j][0];
                    arrayB1[j][0]=d;
                }
                if((arrayS1[j][0]>arrayS1[i][0])){
                    r=arrayS1[i][1];
                    d=arrayS1[i][0];
                    arrayS1[i][1]=arrayS1[j][1];
                    arrayS1[j][1]=r;
                    arrayS1[i][0]=arrayS1[j][0];
                    arrayS1[j][0]=d;
                }
            }
        }
        for(int i=0;i<b;i++){
            if (arrayS1[i][0]!=-1000){
                count++;
            }
        }
        int result=0;
        if (s<count){
            result= count-s;
            for (int i=result;i<s+result;i++){
                if(arrayS1[i][0]!=-1000){
                    System.out.println("S " + arrayS1[i][0] + ' ' + arrayS1[i][1]);
                }
            }
        }
        else {
            for (int i = result; i < s; i++) {
                if (arrayS1[i][0] != -1000) {
                    System.out.println("S " + arrayS1[i][0] + ' ' + arrayS1[i][1]);
                }
            }
        }
        for (int i=0;i<s;i++) {
            if (arrayB1[i][0] !=-1000) {
                System.out.println("B " + arrayB1[i][0] + ' ' + arrayB1[i][1]);
            }
        }
    }
}