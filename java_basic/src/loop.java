import java.util.*;

public class loop {
    public static void main (String... argv){

        int length,width;

        for (length=1; length<=9; length++){

            for (width=1; width<=9; width++){
                System.out.print(length+"*"+width+"="+length*width+"\t");
            }

            System.out.println();
        }

    }
}
