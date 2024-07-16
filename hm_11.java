import java.util.Random;

public class hm_11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
        }
        
        System.out.print("陣列元素: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("陣列中的最大值: " + max);
    }
}
