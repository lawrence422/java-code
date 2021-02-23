import java.util.Scanner;

class Recursive {
    long power(int x, int y) {
        if (y <= 0)
            return 1;
        return x * power(x, y - 1);
    }
}

class Recursive2 {

    long power(int x, int y) {
        if (y <= 0)
            return 1;

        if(y%2==0)
            return power(x, y / 2) * power(x, y / 2);

        return x * power(x, y / 2) * power(x, y / 2);
    }

}

public class power {
    public static void main(String... argv) {

        Recursive r = new Recursive();
        Recursive2 k =new Recursive2();
        Scanner sc = new Scanner(System.in);
        System.out.println("input x,y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(r.power(x, y));

        System.out.println(k.power(x, y));

    }
}
