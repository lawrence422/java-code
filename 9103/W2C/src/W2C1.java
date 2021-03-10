public class W2C1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        String str = args[0];
        System.out.println(str + " is " + str.length() + " characters long");
    }
}
//    Length of String
//        In this challenge question are asking you to get the length of a string given via command line arguments.
//        You can get the length of a String by using the .length() method associated with it.
