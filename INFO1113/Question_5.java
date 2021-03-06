public class Question_5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        int z = 3;

        if (x > y) {
            if (y > z)
                System.out.print(x + "\t" + y + "\t" + z);
            if (y <= z) {
                if (x > z)
                    System.out.print(x + "\t" + z + "\t" + y);
                if (x <= z)
                    System.out.print(z + "\t" + x + "\t" + y);
            }

        }
        ;
        if (x <= y) {
            if (x > z)
                System.out.print(y + "\t" + x + "\t" + z);
            if (x <= z) {
                if (y > z)
                    System.out.print(y + "\t" + z + "\t" + x);
                if (y <= z)
                    System.out.print(z + "\t" + y + "\t" + x);
            }

        }
        ;
    }
}