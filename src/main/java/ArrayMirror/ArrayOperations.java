package ArrayMirror;

public class ArrayOperations {

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] flipHorizontally(int[][] array) {
//        int[][] flippedH = Arrays.copyOf(array, array.length);            //To też modyfikuje sam array
        int[][] flippedH = new int[array.length][array[0].length];          //ToDo Może jest lepszy sposób na tworznie pustej kopii tablicy?
        for (int i = 0; i < array.length; i++) {
            int length = array[i].length;
            for (int j = 0; j < length; j++) {
                flippedH[i][j] = array[i][length - 1 - j];
            }
        }
        return flippedH;
    }

    public static int[][] flipVertically(int[][] array) {
//        int[][] flippedV = Arrays.copyOf(array, array.length);
        int[][] flippedV = new int[array.length][array[0].length];          //ToDo To samo co wyżej
        for (int i = 0; i < array.length; i++) {
            flippedV[i] = array[array.length - 1 - i];

        }
        return flippedV;
    }

    public static int[][] flipDiagonally(int[][] array) {
        return flipVertically(flipHorizontally(array));
    }

}
