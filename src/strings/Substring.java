package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

       Pattern alphabeticPatter=Pattern.compile("^[A-Za-z]+$");

       try {
           if (!alphabeticPatter.matcher(S).matches()){
               throw new Exception("invalid String format");
           }else {
               String subStringWord=S.substring(start,end);
               System.out.println(subStringWord);
           }
       }catch (Exception ex){
           System.out.println(ex);
       }



    }
}
