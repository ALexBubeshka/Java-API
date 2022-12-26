import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// * 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// * private static <T> List<T> reverse(LinkedList<T> source) {
// *    return null;
// * }
// */

public class exercise4_2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            LinkedList<Integer> linkList = new LinkedList<>();
            addItems(scan, linkList);
            reverse(linkList);
      }

      private static Object reverse(LinkedList<Integer> linkList) {
            for (int i = linkList.size() - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(linkList.get(i));
                } else {
                    System.out.print(linkList.get(i) + "\n");
                }
            }
            return linkList;
        }
    
      private static Object addItems(Scanner scan, LinkedList<Integer> linkList) {
            Random random = new Random();
            System.out.print("Введите количество элементов: ");
            int len = scan.nextInt();
            for (int i = 0; i < len; i++) {
                int s = random.nextInt(10);
                linkList.add(s);
                if (i != len - 1) {
                    System.out.print(linkList.get(i));
                } else {
                    System.out.print(linkList.get(i) + "\n");
                }
            }
      return linkList;
      }
}
