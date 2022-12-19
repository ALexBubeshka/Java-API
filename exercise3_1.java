import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

// 1. Пусть дан произвольный список целых чисел,
//  удалить из него четные числа (в языке уже есть что-то готовое для этого)

public class exercise3_1 {
      public static void main(String[] args) {
            Random rand = new Random();
            List<Integer> numbers = new ArrayList<>();
            Predicate<Integer> predicate = i -> i % 2 == 0;
            for (int i = 0; i < rand.nextInt(20) + 1; i++){
                  numbers.add((int) (Math.random() * 99));
            }
            System.out.println(numbers);
            remove(numbers,predicate);
      }
      public static void remove(List<Integer> numbers, Predicate<Integer> predicate){
            numbers.removeIf(predicate);
            System.out.println(numbers);
      }
}
