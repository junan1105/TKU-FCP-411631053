public class hm_18 {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        calculateLayerAverages(array);
    }

    public static void calculateLayerAverages(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    sum += array[i][j][k];
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.printf("第 %d 層的平均值: %.2f%n", i + 1, average);
        }
    }
}
