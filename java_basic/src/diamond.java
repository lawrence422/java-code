import java.util.*;

public class diamond {

    public static void main (String... argv) {

        int i, j, k, input;

        Scanner sc=new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("error");
            sc.next();
        }

        do {
            input= sc.nextInt();

            for (i = 0; i < input / 2 + 1; i++) {

                for (j = (input / 2); j > i; j--) {
                    System.out.print(" ");
                }

                for (k = 1; k <= 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            i--;

            while (i > 0) {
                i--;
                for (j = 1; j <= (input / 2) - i; j++) {
                    System.out.print(" ");
                }

                for (k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }while (input!=0);
    }
}
