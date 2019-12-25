package allMyHomework;
public class homework2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 594;
        int c = 718;
        int d = 5;
        int e = 3;
        int max = a;
        if (b > max) {
            max = b;//594
        }
        if (c > max) {
            max = c;//718
        }
        if (d > max) {//
            max = d;
        }
        if (e > max) {
            max = e;
        }
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {//3
            min = e;
        }
        System.out.println(max);
        System.out.println(min);
    }
}

//наибольшее и наименьшее число