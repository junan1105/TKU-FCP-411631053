import java.util.Scanner;

public class hm_06 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入第一個整數
        System.out.print("請輸入第一個整數: ");
        int num1 = scanner.nextInt();

        // 提示使用者輸入第二個整數
        System.out.print("請輸入第二個整數: ");
        int num2 = scanner.nextInt();

        // 計算兩數之和
        int sum = num1 + num2;

        // 輸出結果
        System.out.println("兩數之和為: " + sum);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
