import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入圓的半徑
        System.out.print("請輸入圓的半徑: ");
        double radius = scanner.nextDouble();

        // 計算圓的面積
        double area = Math.PI * radius * radius;

        // 輸出結果，保留兩位小數
        System.out.printf("圓的面積為: %.2f\n", area);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
