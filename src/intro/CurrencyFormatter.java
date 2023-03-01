package intro;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //Current loale
        //String us = NumberFormat.getInstance().format(payment);

        //getIntance just brings the value formatted
        //getCurrencyInstance brings the value formatted and currency format

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
