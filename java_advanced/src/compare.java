class test {
    int x = 3;

    void show() {
        System.out.println("x= " + x);
    }
}

public class compare {

    public static void main(String... argv) {
        test a, b, c;

        a = new test();
        b = new test(); // new = 創新的物件，所以a!=b

        System.out.println("a==b ? " + (a == b) + "\t" + a + "\t" + b);

        c = b;
        c.x = 10;

        System.out.println("c==b ? " + (c == b) + "\t\t" + c + "\t" + b);
        a.show();

    }

}
