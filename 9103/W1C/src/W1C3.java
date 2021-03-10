public class W1C3 {
    public static int parseInt(String arg) {
        int x = -1;
        try {
            x = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            //ignore!
            x = -1;
        }
        return x;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }
        int n1 = parseInt(args[0]);
        int n2 = parseInt(args[1]);

        System.out.println("Is " + n1 + " > " + n2 + "? " + (n1 > n2));

    }
}
//    Compare Two Numbers
//        You are tasked with writing a program that will take two numbers from standard input and evaluate if the first number is greater than the second
//
//        Example 1 output (args[0] = 7, args[1] = 8):
