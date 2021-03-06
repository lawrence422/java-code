import java.util.*;

public class java5 {
    public static void main(String... argv) {
        int input_number;
        System.out.println("input");
        Scanner sc = new Scanner(System.in);
        input_number = sc.nextInt();
        switch (input_number) {
            case 10:
                System.out.println("10");
                break;

            case 50:
                System.out.println("50");
                break;

            default:
                System.out.println("NONE");

        }


    }
}