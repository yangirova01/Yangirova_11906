package Homeworks;
public class TooLongArgumentException extends Exception {
    private int index;
    TooLongArgumentException(String max, String tooLong) {
        index = tooLong.indexOf(max);
        if (index == 0) {
            System.out.println("Слишком большое число первое!");
        } else {
            System.out.println("Слишком большое число второе");
        }
    }
}
