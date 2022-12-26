import java.util.LinkedList;
import java.util.Scanner;

//  * 1. Реализовать консольное приложение, которое:
//  * Принимает от пользователя строку вида
//  * text~num
//  * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//  * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//  * > first~1
//  * > third~3
//  * > print~1
//  * < first
//  * > print~2
//  * < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)

public class exercise4_1 {
      public static void main(String[] args) {
            String str = "";
            int s = 0;
            LinkedList<String> linkList = new LinkedList<>();
            for (int i = 0; i < 10; i++){
                  linkList.add(i,"");
            }
            do {
                  Scanner scan = new Scanner(System.in);
                  System.out.print("Введите текст вида 'text~num': ");
                  str = scan.nextLine();
                  if (str.contains("~") && !str.contains("print")){
                        String[] data = str.split("~");
                        linkList.add(Integer.valueOf(data[1]),data[0]);
                  } 
                  else if (str.contains("print") && str.contains("~")){
                        String[] dataPrint = str.split("~");
                        if (linkList.get(Integer.valueOf(dataPrint[1])) == ""){
                              System.out.println("Tакого элемента нет");
                        } else {
                        System.out.println(linkList.get(Integer.valueOf(dataPrint[1])));
                        s = Integer.valueOf(dataPrint[1]);
                        linkList.remove(s);  
                        }  
                  }
                  else if(!str.contains("q")) {
                        System.out.println("Ошибка ввода");
                  }      
            }
            while (!str.equals("q"));   
      }
}
