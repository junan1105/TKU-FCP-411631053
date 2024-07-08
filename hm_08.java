import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        // 創建 Scanner 對象來獲取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入姓名
        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        // 提示使用者輸入年齡
        System.out.print("請輸入您的年齡: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 清除緩衝區中的換行符

        // 提示使用者輸入城市
        System.out.print("請輸入您的城市: ");
        String city = scanner.nextLine();

        // 輸出使用者輸入的個人資訊
        System.out.println("\n個人資訊:");
        System.out.println("姓名: " + name);
        System.out.println("年齡: " + age);
        System.out.println("城市: " + city);

        // 關閉 Scanner 對象
        scanner.close();
    }
}
