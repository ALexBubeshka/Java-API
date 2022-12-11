import java.util.Scanner;

// Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

public class exercise3 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите целое число");
      int x = scan.nextInt();
      scan.close(); 
      System.out.println(isNegative(x));
   }
      public static boolean isNegative(int x) {
      if (x >= 0) {
            return false;
      } else {
            return true;
      }      
   }   
}
