package brackets1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

 class Result {

    public static Boolean isBalanced(String s) {

        // Convert string to character array
        char[] array = s.toCharArray();

        List<Character> list = new ArrayList<>();

        // Return "NO" if starting bracket is closing bracket
        if (array[0] == ')' || array[0] == '}' || array[0] == ']') {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ')' && array[i] != '}' && array[i] != ']') {
                list.add(array[i]);
            } else if (list.size() == 0) {
                return false;
            } else {
                char lastBreacket = list.get(list.size()-1);
                if (lastBreacket == '(' && array[i] != ')') {
                    return false;
                } else if (lastBreacket == '{' && array[i] != '}') {
                    return false;
                } else if (lastBreacket == '[' && array[i] != ']') {
                    return false;
                } else {
                    list.remove(list.size()-1);
                }
            }
        }

        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}

