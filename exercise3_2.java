import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 2. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class exercise3_2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Введите длину списка: ");
            int len = scan.nextInt();
            List<Integer> numbers = new ArrayList<>(len);
            for (int i = 0; i < len; i++) {
                  numbers.add(rand.nextInt(20));
            }

            System.out.println(numbers);

            IntSummaryStatistics stats = new IntSummaryStatistics();
            for (int num: numbers){
                  stats.accept(num);
            }

            System.out.println("Минимальное число: " + stats.getMin());
            System.out.println("Максимальное число: " + stats.getMax());
            System.out.println("Среднее арифметическое число: " + stats.getAverage());
            scan.close();
      }
}
