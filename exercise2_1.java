

// * 1. Напишите метод, который принимает на вход строку (String) и
// * определяет является ли строка палиндромом (возвращает boolean значение).
// * шалаш
// * abcdedcba

public class exercise2_1 {
      public static void main(String[] args) {
         System.out.println(isPalindrome("шалаш"));
      }
      public static boolean isPalindrome(String text) {
            StringBuilder strBuilder = new StringBuilder(text);
            strBuilder.reverse(); 
            String invertedText = strBuilder.toString();
            return text.equalsIgnoreCase(invertedText) ;
        }
}
