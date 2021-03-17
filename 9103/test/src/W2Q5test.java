import java.util.*;

public class W2Q5test {

    static int countDuplicates(int[] a) {
        if (a == null)
            return 0;

        int test = a[0] - 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
            if (a[i] == test) {
                if (list.contains(a[i]) == false)
                    list.add(a[i]);
            }
            else
                test = a[i];
        }

        System.out.println();
        System.out.println(list);
        return list.size();
    }

    public static void main(String[] args) {
        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = countDuplicates(dups);

        System.out.println(result);
    }
}
