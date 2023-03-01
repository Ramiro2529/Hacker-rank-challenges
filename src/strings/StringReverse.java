package strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
//ma d am 5/2=2.5
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String R = new StringBuilder(A).reverse().toString();

        System.out.println("A= " + A);
        System.out.println("R= " + R);

        if (A.equals(R))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
