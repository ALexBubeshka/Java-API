import java.io.File;

// 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
//  * и выведет в консоль результат вида
//  *          1 Расширение файла: txt
//  *          2 Расширение файла: pdf
//  *          3 Расширение файла:
//  *          4 Расширение файла: jpg

public class exercise2_2 {
      public static void main(String[] args) {
            File f = new File("/Users/alexanderbubeshka/Java/Java-API/README.txt");
            String path = f.getPath();
            System.out.println("Расширение файла: " + fileExtension(path));   
      }
      public static String fileExtension(String fileName) {
            String extension = "";
            int index = fileName.lastIndexOf('.');
            if (index > 0) {
                extension = fileName.substring(index + 1);
            }
            return extension;
        }
}
