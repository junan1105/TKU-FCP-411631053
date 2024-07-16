
public class Ch6_4_1 {   
    public static void main(String[] args){
      int sum =0;
      int [][] sales={{32,35,26,30},{34,30,33,31}};

      for(int r=0;r<sales.length;r++){
          for(int c=0;c<sales[r].length;c++){
          System.out.print(sales[r][c]+" ");
          sum+=sales[r][c];
      }
      System.out.println();
    }
      System.out.printf("總銷售量為 %d 部車",sum);
        
      }
    }
