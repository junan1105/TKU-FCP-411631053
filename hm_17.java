import java.util.Scanner;
public class hm_17 {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2},
            {3, 4}},
            {{5, 6},
            {7, 8}}
        };

        System.out.println("原始三維陣列:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要修改的元素位置（格式：i j k）：");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print("請輸入新值：");
        int newValue = scanner.nextInt();

        modifyElement(array, i, j, k, newValue);

        System.out.println("修改後的三維陣列:");
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

    public static void modifyElement(int[][][] array, int i, int j, int k, int newValue) {
        if (i >= 0 && i < array.length && j >= 0 && j < array[i].length && k >= 0 && k < array[i][j].length) {
            array[i][j][k] = newValue;
        } else {
            System.out.println("無效的位置");
        }
    }
}
