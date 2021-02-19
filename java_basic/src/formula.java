import java.util.*;

public class formula {

    public static void main(String... argv) {

        int x, n, i;
        float sum = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);

        do {
            System.out.println("please input x and n");

            while (!sc.hasNextInt() || !sd.hasNextInt()) {
                System.out.println("error");
                sc.next();
                sd.next();
            }

            x = sc.nextInt();
            n = sd.nextInt();

            for (i = 1; i <= n; i++) {
                sum = sum + ((x + i) / (n - i + 1));

            }

            System.out.println(sum);
            sum = 0;
        } while (n != 0);


    }

}
