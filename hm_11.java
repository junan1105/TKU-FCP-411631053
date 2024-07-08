import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入第一件商品的價格
        System.out.print("請輸入第一件商品的價格: ");
        double price1 = scanner.nextDouble();

        // 提示使用者輸入第二件商品的價格
        System.out.print("請輸入第二件商品的價格: ");
        double price2 = scanner.nextDouble();

        // 提示使用者輸入第三件商品的價格
        System.out.print("請輸入第三件商品的價格: ");
        double price3 = scanner.nextDouble();

        // 計算總價
        double totalPrice = price1 + price2 + price3;

        // 輸出總價
        System.out.printf("三件商品的總價為: %.2f\n", totalPrice);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
