public class W2Q4 {
    static int count(int[] a, int element) {
        int count = 0;

        for (int i : a)
            if (i == element)
                count++;

        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = count(array, 1);

        System.out.println(result);
    }
}