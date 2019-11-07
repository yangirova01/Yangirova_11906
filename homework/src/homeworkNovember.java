import java.util.Scanner;

public class homeworkNovember {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        int a = 0;
        int b = 0;
        a = (int) c.charAt(0) - 48;
        b = (int) c.charAt(2) - 48;
        System.out.println(a + b);
    }
}

