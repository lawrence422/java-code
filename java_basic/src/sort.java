public class sort {

    public static void main(String... argv) {

        int a[] = {99, 6, 7, 93, 46, 34, 77, 23, 70, 88, 5};
        int temp;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }

        }

        for (int k : a) {
            System.out.print(" " + k);
        }

        System.out.println("");
    }

}
