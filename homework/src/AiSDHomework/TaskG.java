package AiSDHomework;
import java.util.Scanner;
import java.util.StringTokenizer;
public class TaskG {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            int size = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int[]mas=new int[size];
            String[] string=scanner.nextLine().split(" ");
            int count = 0;
            int sum = 0;
            int k = 0;
            for (int i = 0;i<size;i++){
                mas[i]=Integer.parseInt(string[i]);
            }
            for (int i = 0;i<height;i++){
                count+=mas[i];
            }
            int result = count;
            for (int j = height;j<size;j++){
                result = result + mas[j];
                result = result - mas[k++];
                if (result<count){
                    count = result;
                    sum = k;
                }
            }
            System.out.println(sum);
        }
}
