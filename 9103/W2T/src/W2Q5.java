import java.util.ArrayList;

public class W2Q5 {

    static int countDuplicates(int[] a) {
        if(a==null)
            return 0;
        ArrayList <Integer>list = new ArrayList<Integer>();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    if (list.contains(a[i]) == false)
                        list.add(a[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = countDuplicates(dups);

        System.out.println(result);
    }
}

//    static int countDuplicates(int[] a)
//Example:
//        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
//        int result = countDuplicates(dups);
////3