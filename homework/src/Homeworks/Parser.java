package Homeworks;

import java.util.InputMismatchException;

public class Parser {
    private long firstNum;
    private long secondNum;
    private String operation;
    private String tooLong;
    private static final char[] OPERATION = {'+', '-', '/', '*'};

    Parser(String str) throws InputMismatchException, IllegalArgumentException, TooLongArgumentException {
        this.tooLong = str;
        String[] fragment = getFragment(str);
        this.firstNum = parse(fragment[0]);
        this.secondNum = parse(fragment[2]);
        this.operation = fragment[1];
    }

    public long getFirstNum() {
        return firstNum;
    }

    public long getSecondNum() {
        return secondNum;
    }

    public String getOperation() {
        return operation;
    }

    private String[] getFragment(String str) throws IllegalArgumentException, InputMismatchException {
        String[] result = new String[]{"", "", ""};
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (!isOperation(elem) && !isNum(elem) && elem != ' ') {
                throw new IllegalArgumentException();
            } else if (elem != ' ') {
                result[k] += elem;
            } else {
                k++;
            }
            if (k > 2) {
                throw new InputMismatchException();
            }
        }
        return result;
    }

    private static boolean isOperation(char ch) {
        for (int i = 0; i < OPERATION.length; i++) {
            if (ch == OPERATION[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNum(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private long parse(String str) throws TooLongArgumentException {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new TooLongArgumentException(tooLong, str);
        }
    }
}