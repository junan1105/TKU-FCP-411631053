import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入華氏溫度
        System.out.print("請輸入華氏溫度: ");
        double fahrenheit = scanner.nextDouble();

        // 將華氏溫度轉換為攝氏溫度
        double celsius = (fahrenheit - 32) * 5 / 9;

        // 輸出攝氏溫度
        System.out.printf("攝氏溫度為: %.2f\n", celsius);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
