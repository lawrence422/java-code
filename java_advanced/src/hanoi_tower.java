import java.io.*;

class Game {
    long sum = 0;
    int recursive = 0;

    void go(int discs) {
        hanoiTower('A', 'C', 'B', discs);
    }

    void moveDisc(char source, char target, int disc) {
        sum++;
        System.out.println("disc"+disc+" : pillar " + source + " >> pillar " + target + "\t" + sum + "steps");
    }

    // a: source ;c: target ; b : empty pillar;
//    the number of n discs from A go by B to C
    void hanoiTower(char a, char c, char b, int discs) {
        recursive++;

        System.out.println("source : " + a + "\ttarget : " + c + "\tempty pillar : " + b + "\tdiscs : "+discs+"\trecursive : " + recursive+"\tsum : "+sum);
        if (discs == 1) {
            moveDisc(a, c, discs); //move the min th in this recursive
            recursive--;
            System.out.println("return recursive : "+recursive);
            return;
        }
        hanoiTower(a, b, c, discs - 1); // the number of n-1 discs from A go by C to B
        moveDisc(a, c, discs); // move the max th in this recursive
        recursive--;
        hanoiTower(b, c, a, discs - 1); //the number of n-1 discs from B go by A to C
    }


}

public class hanoi_tower {
    public static void main(String... argv) throws IOException {
        Game game = new Game();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many discs do you have");
        int discs = java.lang.Integer.parseInt(br.readLine());

        game.go(discs);

    }
}
