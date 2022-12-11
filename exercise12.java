
// Найти общий префикс среди слов из одного массива.
// ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""


public class exercise12 {
      public static void main(String[] args) {
            String[] array = {"aaa", "aab", "aa"};
            System.out.println(longestCommonPrefix(array));
}
public static String longestCommonPrefix(String[] strs) {
      if(strs.length == 0){
        return "";
      }
      if (strs.length == 1){
        return strs[0];
      }
       
      String rez = strs[0];
      for(int i = 1; i < strs.length; i ++){
        String cur = strs[i];
        int reader = 0;
        int lastCommon = 0;
        while(reader < rez.length() && reader < cur.length()){
          if(rez.charAt(reader) == cur.charAt(reader)){
            lastCommon ++;
          } else {
            break;
          }
          reader++;
        }
        rez = rez.substring(0, lastCommon);
      }
      return rez;
}
}