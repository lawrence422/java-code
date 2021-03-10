public class W2C3  {
    static boolean contains(int[] a, int element) {
        if(a==null)
            return false;
        for (int i : a)
            if (i == element)
                return true;

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 5, 5, 3, 8, 1};
        boolean result = contains(array, 5);

        System.out.println(result);
    }
}
//Contains
//        You are tasked with writing the method contains that will check if the element exists within a given array.
//        Your method must also handle null references that may be passed.