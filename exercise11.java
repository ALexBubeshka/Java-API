import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class exercise11 {
      public static void main(String[] args) {
            int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 } ;
            List<Integer> ints = Arrays.stream(array).boxed().collect(Collectors.toList());
            System.out.println("Минимальный эдемент: " + Collections.min(ints));
            System.out.println("Максимальный эдемент: " + Collections.max(ints));
      }
}
