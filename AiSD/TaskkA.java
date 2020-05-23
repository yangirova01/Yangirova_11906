package AiSD;
import java.util.Arrays;
import java.util.Scanner;
public class tasssskee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = scan.nextInt();
        }
        Arrays.sort(arr1);//    сортируем по возрастанию
        int size1 = scan.nextInt();
        int[] arr2 = new int[size1];
        for (int j = 0; j < size1; j++) {
            arr2[j] = scan.nextInt();
        }
        for (int i = 0; i < size1; i++) {
            int left = 0; 12345
            int right = size1 - 1; 4
            while (left <= right) { 0 4
                int mid = (left + right) / 2; 2
                if (arr1[mid] < arr2[i]) {
                    left = mid + 1;
                } else if (arr1[mid] >= arr2[i]) {
                    right = mid - 1;
                }
            }
            System.out.print(left + " ");

        }
    }
}