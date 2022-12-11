import java.util.Scanner;

// Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class exercise4 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String str = scan.nextLine();
            System.out.print("Введите число: ");
            int x = scan.nextInt();
            for (int i = 0; i < x; i++){
                  System.out.println(str);
            }
            scan.close();
      }
}
