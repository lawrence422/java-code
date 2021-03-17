public class loop {
    public static void main(String[] args) {
        int[] count = new int[3];

        for (int i = 0; i < 10; i++)
            count[0]++;

        int j = 0;
        do {
            count[1]++;
            j++;
        } while (j < 10);

        int k = 0;
        while (k < 10) {
            count[2]++;
            k++;
        }

    for (int l:count)
        System.out.println(l);
    }
}
