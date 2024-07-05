package HomeWork;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String [] stringArray = {"ab", "cd", "ef"};
        symbols(stringArray);
    }
    private static void symbols (String [] stringArray){
        for (String item: stringArray){
            char symbol = item.charAt(0);
            char symbol1 = item.charAt(1);
            System.out.println(symbol);
            System.out.println(symbol1);


        }
    }
}

