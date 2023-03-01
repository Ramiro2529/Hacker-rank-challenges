package strings;

import java.util.Scanner;

public class SubStringComparisions {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String stringSubLar="";
        String stringSub="";
        int stringLength=s.length()-k;

        for (int i = 0; i <=stringLength; i++) {

            String substring = s.substring(i, k + i);
            stringSub= substring;
            stringSubLar= substring;
            System.out.println(stringSub);
            int compareAtoB=smallest.compareTo(stringSub);
            int compareCtoD=largest.compareTo(stringSubLar);
            boolean smallestIsSmallerThanB=(compareAtoB<0);
            boolean largestIsLargerThanD=(compareCtoD>0);
            if((!smallestIsSmallerThanB)&& (!smallest.equals(""))){
                smallest=stringSub;
            }
            if ((!largestIsLargerThanD)){
                largest=stringSubLar;
            }
        }

        System.out.println(smallest+" is the smallest");
        System.out.println(largest+" is the largest");

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // return smallest + "\n" + largest;
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
