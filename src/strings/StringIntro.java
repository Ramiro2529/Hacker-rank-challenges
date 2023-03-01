package strings;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        Integer lengthOfA = A.length();
        Integer lengthOfB = B.length();
        Integer sumOfBoth = lengthOfA + lengthOfB;
        System.out.println(sumOfBoth);
        Integer sortedAB = A.compareTo(B);


        Boolean isGreaterThanB = (sortedAB > 0);
        System.out.println(isGreaterThanB ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase() + B.substring(1,B.length()));

    }
}
