public class hm_13 {
    public static void main(String[] args) {
        // 創建一個 4x4 的二維陣列
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // 計算每一行的元素總和
        System.out.println("每一行的元素總和:");
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            System.out.println("第 " + (i + 1) + " 行的總和: " + rowSum);
        }
    }
}
