package intro;

import java.util.*;

class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res ;
            res = (int) ((a + (Math.pow(2, 0)) * b));
            int cont = 0;
            int resFinal = 0;
            double res2;
            System.out.print(res + " ");
            for (int j = 1; j < n; j++) {
                cont++;
                switch (cont) {
                    case 1:
                        res2 = res + ((Math.pow(2, cont)) * b);
                        break;
                    default:
                        res2 = ((Math.pow(2, cont)) * b);
                }
                resFinal = (int) (resFinal + res2);
                System.out.print(resFinal + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}

/*
int resultBase = a + b;
            for (int j=1 ; j <= n; j++){
                System.out.print(resultBase + " ");
                resultBase += Math.pow(2,j)*b;
            }
            System.out.print("\n");
 */