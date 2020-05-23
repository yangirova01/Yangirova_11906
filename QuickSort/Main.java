package QuickSort;
import java.io.*;
import java.util.*;

public class Main {
    private static int LineCounterReader ;
    private static int LineCounterGenerate;

    public static void main(String[] args) throws IOException {
        generate(1000); // text.txt
        for (int i = 0; i < 900; i++) {
            QuickSort s = new QuickSort();
            int [] arr = readline();
            s.quickSort(arr, 0, arr.length - 1);
            System.out.println("--------------------------------");
            System.out.printf("Iterator count: %d\n ", s.getIter());
            System.out.printf("length:%d\n", arr.length);
            System.out.printf("TimeMillis: %d\n ", s.testMilli(arr, 0, arr.length - 1));
            System.out.printf("TimeNano: %d\n ", s.testNano(arr, 0, arr.length - 1));
            System.out.println("--------------------------------");
            System.out.println(Arrays.toString(arr));

        }

    }
    public static int[] readline() throws FileNotFoundException {
        if (LineCounterReader >= LineCounterGenerate) {
            return null;
        }
        LineCounterReader++;
        Scanner scanner = new Scanner(new File("test.txt"));
        String line = null;
        for (int i = 0; i < LineCounterReader; i++) {
            line = scanner.nextLine();
        }
        String [] array = line.split(" ");
        int[] arrInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrInt[i] = Integer.parseInt(array[i]);
        }
        return arrInt;
    }

    public static void generate(int count) throws FileNotFoundException, UnsupportedEncodingException {
        LineCounterGenerate = count;
        PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < r.nextInt(3000); j++) {
                line.append(r.nextInt(1000) + " ");
            }
            writer.println(line);
        }
    }
}