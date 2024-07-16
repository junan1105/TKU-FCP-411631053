public class hm_16 {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2},
            {3, 4}},
            {{5, 6},
            {7, 8}}
        };

        int sum = calculateSum(array);

        System.out.println("三維陣列的所有元素總和: " + sum);
    }

    public static int calculateSum(int[][][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    sum += array[i][j][k];
                }
            }
        }
        return sum;
    }
}
