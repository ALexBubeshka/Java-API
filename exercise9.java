import java.util.Scanner;

// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
//  (можно только одну из диагоналей, если обе сложно).
//   Определить элементы одной из диагоналей можно по следующему принципу:
//    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class exercise9 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Вве6дите размер квадратного двумерного массива: ");
            int size = scan.nextInt();
            int[][] array = new int[size][size];
            int num = 1;
            int d = size - 1;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        array[i][j] = num;
                    } else if (j == d) {
                        array[i][j] = num;
                        d--;
                    }
                    System.out.printf("%2s", array[i][j]);
                }
                System.out.println();
                scan.close();
            }
      }
 }
      

