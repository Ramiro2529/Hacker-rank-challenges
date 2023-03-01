package intro;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            String s = String.valueOf(n);
            boolean result=s instanceof String;

            if (result) {
                System.out.println("Good job");
            } else {
                throw new Exception("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        /*if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    } catch (DoNotTerminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
    }*/


    }
}
