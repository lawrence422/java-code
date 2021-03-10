import java.util.*;

public class W2C8 {
    public static int[] union(int[] a, int[] b) {
        ArrayList<Integer> un = new ArrayList<Integer>();
        if (a == null || b == null)
            return null;

        int[] mix = new int[a.length + b.length];

        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length)
                mix[i] = a[i];
            else
                mix[i] = b[i - a.length];
        }

        for (int j = 0; j < mix.length; j++) {
            if (un.contains(mix[j]) == false)
                un.add(mix[j]);
        }
        int[] array = new int[un.size()];
        for (int k = 0; k < un.size(); k++)
            array[k] = un.get(k);
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] sx = str1.split(", ");
        String[] sy = str2.split(", ");
        int[] x = new int[sx.length];
        int[] y = new int[sy.length];

        for (int i = 0; i < sx.length; i++)
            x[i] = Integer.parseInt(sx[i]);

        for (int j = 0; j < sy.length; j++)
            y[j] = Integer.parseInt(sy[j]);

        union(x, y);
    }
}
//    Array Union*
//        You are tasked with writing a method that will compute the union between two arrays. Using methods from the previous exercises (countDuplicates, contains and count). You will need to detect overlap between the two sets and ensure you are not including an element that appears in both sets more than once.
//
//        You will need to check if there is a duplicate element in both sets as you should only return one element, not both.
//
//        Your method must return null if either array is null.