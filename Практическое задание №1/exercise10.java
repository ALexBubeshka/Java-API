import java.util.Arrays;
import java.util.Scanner;

// Написать метод, принимающий на вход два аргумента: 
// len и initialValue, и возвращающий одномерный массив типа int длиной len, 
// каждая ячейка которого равна initialValue;

public class exercise10 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите длинну массива: ");
            int len = scan.nextInt();
            System.out.print("Введите значение ячейки: ");
            int initialValue = scan.nextInt();
            arrayValues(len, initialValue);
            scan.close();
      }
    
        private static int[] arrayValues(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            System.out.println(Arrays.toString(array));
            return array;
      }
}
