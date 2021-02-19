public class integer_parse {
    public static void main(String... argv) {

        double fact=1;
        int i =5;
        if(argv.length>0)
            i=Integer.parseInt(argv[0]);

        System.out.print(i+"!=");

        for(;i>0;i--) {
            fact *= i;
        }

        System.out.println(fact);

    }
}
