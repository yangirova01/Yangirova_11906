package StreamAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Evgenya {
    public static void main(String[] args) throws IOException {
        Scanner n1 = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\PC\\Gorshenina-11906\\src\\classwork050520\\file.txt"));
        String s = in.readLine();
        while (s != null) {
            list.add(s);
            s = in.readLine();
        }


        System.out.print(list.stream().filter(((line) -> line.startsWith("c:/users") && (right(line)) &&
                (line.contains(".docx")))).count());


    }

    public static boolean right(String s) {
        StringTokenizer st = new StringTokenizer(s, "/");
        String line = null;
        int count = 0;
        while ((count < 4) && st.hasMoreTokens()) {
            line = st.nextToken();
            count++;
        }
        return "documents".equals(line);

    }
}
