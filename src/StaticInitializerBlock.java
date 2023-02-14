import java.util.Scanner;

public class StaticInitializerBlock {
    private static Integer breadth;
    private static Integer height;

    public static void main(String[] args) throws Exception {
        Integer result;


        try {
            if ((breadth <= 0) || (height <= 0)) {

                throw new Exception("Breadth and height must be positive");
            } else {
                result = height * breadth;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert height: ");
        breadth = sc.nextInt();
        System.out.println("insert breath: ");
        height = sc.nextInt();

    }
}
