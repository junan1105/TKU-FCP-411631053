import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入長方形的長
        System.out.print("請輸入長方形的長: ");
        double length = scanner.nextDouble();

        // 提示使用者輸入長方形的寬
        System.out.print("請輸入長方形的寬: ");
        double width = scanner.nextDouble();

        // 計算長方形的面積
        double area = length * width;

        // 輸出長方形的面積
        System.out.printf("長方形的面積為: %.2f\n", area);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
