public class W2C5 {
        public static int[][] mergeArrays(int[][] arrayA, int[][] arrayB) {
            if (arrayA == null || arrayB == null)
                return null;

            int[][] arrayMix = new int[arrayA.length][arrayA[0].length + arrayB[0].length];
            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayA[0].length + arrayB[0].length; j++)
                    if (j < arrayA[0].length)
                        arrayMix[i][j] = arrayA[i][j];
                    else
                        arrayMix[i][j] = arrayB[i][j - arrayA[0].length];

            }
            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayA[0].length + arrayB[0].length; j++)
                    System.out.print(arrayMix[i][j] + "\t");
                System.out.println();
            }
            return arrayMix;
        }
}
//    Array Merge
//    You are tasked with writing a method which takes two two dimensional arrays-
//        of integers and merge them into another two dimensional array.
