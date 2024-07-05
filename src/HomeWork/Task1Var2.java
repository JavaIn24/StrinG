package HomeWork;

import java.util.Arrays;

public class Task1Var2 {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        symbols(stringArray);
    }

    private static void symbols(String[] stringArray) {
        for (String item : stringArray) {
            int start = 0;
            int end = 2;
            char[] chars = new char[end - start];
            item.getChars(start, end, chars, 0);
            System.out.println(Arrays.toString(chars));
        }
    }
}