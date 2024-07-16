public class hm_15 {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2},
            {3, 4} },
            {{5, 6},
            {7, 8} }
        };

        System.out.println("三維陣列的所有元素:");
        printArray(array);
    }

    public static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
