import java.io.*;

class math {
    long c_fibonacci(long a[],int n) {
        if(a[n]==0) {
            if (n <= 2) {
                a[n] = 1;
            } else {
                a[n] = c_fibonacci(a,n - 1) + c_fibonacci(a,n - 2);
            }
        }
        return a[n];
    }
}

public class fibonacci {
    public static void main(String... argv) throws IOException {
        long a[] = new long[100];
        int n;
        math m = new math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input n");
        do {

            n = Integer.parseInt(br.readLine());
            System.out.println(m.c_fibonacci(a,n));
            for (int i=1;i<=n;i++)
                System.out.print(a[i]+"\t");
            System.out.println();

        } while (n != 0);
    }

}
