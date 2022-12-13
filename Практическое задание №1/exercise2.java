import java.util.Scanner;

// Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль,
// положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

public class exercise2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            int x = scan.nextInt();
            if (x >= 0) {
                  System.out.println("Число положительное"); 
            } else {
                  System.out.println("Число отрицательное"); 
            }   
            scan.close();  
      }
      
}
