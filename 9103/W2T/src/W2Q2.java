public class W2Q2 {
    static void tree() {
        for (int i = 0; i <= 4; i++) {
            if (i <= 3) {
                for (int j = 3; j - i > 0; j--)
                    System.out.print(" ");

                for (int k = 0; k < 2 * i + 1; k++)
                    System.out.print("*");

                System.out.println();
            } else
                System.out.println("  ***");
        }

    }

    public static void main(String[] args) {
        tree();
    }
}

