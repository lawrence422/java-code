import java.util.*;

public class W2C7 {
    public static int[][] mult(int widthOfA, int heightOfA, int widthOfB, int heightOfB, int[][] A, int[][] B) {
        if (widthOfA != heightOfB) {
            System.out.println("Invalid input.");
            return null;
        }
        if (A == null || B == null || widthOfA == 0 || widthOfB == 0 || heightOfA == 0 || heightOfB == 0) {
            System.out.println("0");
            return null;
        }

        int[][] result = new int[heightOfA][widthOfB];

        for (int i = 0; i < heightOfA; i++) {
            for (int j = 0; j < widthOfB; j++) {
                for (int k = 0; k < widthOfA; k++) {
                    result[i][j] = result[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < heightOfA; i++) {
            for (int j = 0; j < widthOfB; j++) {
                System.out.print(result[i][j]);
                if (j < widthOfB - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] parameter = new int[4];


        for (int i = 0; i < 4; i++)
            parameter[i] = sc.nextInt();

        int[][] A = new int[parameter[1]][parameter[0]];
        int[][] B = new int[parameter[3]][parameter[2]];

        for (int ra = 0; ra < parameter[1]; ra++) {
            for (int ca = 0; ca < parameter[0]; ca++)
                A[ra][ca] = sc.nextInt();
        }
        for (int rb = 0; rb < parameter[3]; rb++) {
            for (int cb = 0; cb < parameter[2]; cb++)
                B[rb][cb] = sc.nextInt();
        }

        mult(parameter[0], parameter[1], parameter[2], parameter[3], A, B);

    }
}
//    Matrix Multiplication
//    Matrix multiplication is a mathematical procedure that produces a resultant matrix from two input matrices.

