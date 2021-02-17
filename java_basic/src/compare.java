
public class compare {
    public static void main (String... argv) {

        int i,j;
        i=j=0;

        System.out.println(i+"\t"+j);

        for (i=0; i<10; i++) {
            j+=1;
        }

        System.out.println(i+"\t"+j);
        i=j=0;

        System.out.println(i+"\t"+j);

        while (i<10) {
            i+=1;
            j+=1;
        }

        System.out.println(i+"\t"+j);

        i=j=0;

        System.out.println(i+"\t"+j);

        do {
            i+=1;
            j+=1;
        } while (i<10);

        System.out.println(i+"\t"+j);
    }
}
