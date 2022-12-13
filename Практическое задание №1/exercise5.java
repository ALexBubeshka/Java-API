import java.util.Scanner;

// Написать метод, который определяет, является ли год високосным, и возвращает boolean 
// (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class exercise5 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите год: ");
            int x = scan.nextInt();             
            scan.close();
            System.out.println(isVisokosYear(x));
      }
      public static boolean isVisokosYear(int x) {
            if (x%4==0 && x%100!=0 || x%400==0) {
                  return true;
            } else {
                  return false;
            }
      }
}

