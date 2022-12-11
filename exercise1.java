import java.util.Scanner;

// Написать метод, принимающий на вход два целых числа и проверяющий,
//  что их сумма лежит в пределах от 10 до 20 (включительно), 
//  если да – вернуть true, в противном случае – false.

public class exercise1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            int first = scan.nextInt();
            System.out.println("Введите второе целое число: ");
            int second = scan.nextInt();
            scan.close();
            System.out.println(isSumm(first,second));
      }
      public static boolean isSumm(int first, int second) {
            if (first + second >= 10 && first + second <= 20) {
                  return true;
            } else {
                  return false;
            }      
      }
}
