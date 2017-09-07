package ArrayMirror;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[][]{
                new int[]{11, 12, 13},
                new int[]{14, 15, 16},
                new int[]{17, 18, 19},
                new int[]{20, 21, 22}};

        System.out.println("Basic array int[][]:");
        ArrayOperations.printArray(array);

        System.out.println("\nVertical flip:");
        ArrayOperations.printArray(ArrayOperations.flipVertically(array));

        System.out.println("\nHorizontal flip:");
        ArrayOperations.printArray(ArrayOperations.flipHorizontally(array));

        System.out.println("\nDiagonal flip:");
        ArrayOperations.printArray(ArrayOperations.flipDiagonally(array));

    }
}
