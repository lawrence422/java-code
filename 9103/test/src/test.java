import java.util.*;

public class test {
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
        for (int l : array)
            System.out.print(l + "\t");
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