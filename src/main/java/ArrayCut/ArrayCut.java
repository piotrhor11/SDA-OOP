package ArrayCut;

public class ArrayCut {

    public static void main(String[] args) {

        int[][] array = new int[][]{
                new int[]{11, 12, 13, 14, 15, 16},
                new int[]{21, 22, 23, 24, 25, 26},
                new int[]{31, 32, 33, 34, 35, 36},
                new int[]{41, 42, 43, 44, 45, 46},
                new int[]{51, 52, 53, 54, 55, 56}};

        System.out.println("Base array:");
        ArrayCut.printArray(array);

        int x = 1;
        int y = 2;
        int sizeX = 2;
        int sizeY = 3;

        System.out.println("Cut array:");
        ArrayCut.printArray(subTab(array, x, y, sizeX, sizeY));
    }

    public static int[][] subTab(int[][] tab, int x, int y, int sizeX, int sizeY) {

        int tabSizeX = tab.length;
        int tabSizeY = tab[0].length;

        if (x + sizeX > tabSizeX) {
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("Zadany wycinek wychodzi poza X podanej tablicy");
            throw e;
        } else if (y + sizeY > tabSizeY) {
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("Zadany wycinek wychodzi poza Y podanej tablicy");
            throw e;
        }else{
            //Todo
        }

        return null;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }


}
