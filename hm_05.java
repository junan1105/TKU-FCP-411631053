// hm_05
public class hm_05 {
    public static void main(String[] args) {

        int a = 12;
        int b = 7;
        
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.printf("%-10s: %d%n", "Sum", sum);
        System.out.printf("%-10s: %d%n", "Difference", difference);
        System.out.printf("%-10s: %d%n", "Product", product);
        System.out.printf("%-10s: %d%n", "Quotient", quotient);
        System.out.printf("%-10s: %d%n", "Remainder", remainder);
    }
}
