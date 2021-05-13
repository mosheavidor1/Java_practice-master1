public class Palindrome {

    public static void main(String[] args) {
        String pal = "sos";
        if(Palindrome(pal)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not");
        }
    }


    public static boolean Palindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i)!= a.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }
}





//public class Palindrome {
//
//
//    public static void main(String[] args) {
//
//
//
//
//        String Some_word="sos";
//
//        if(Palindrome(Some_word)){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("not");
//        }
//
//    }
//
//    public static boolean Palindrome(String word){
//
//        int i=0;
//        int j=word.length()-1;
//
//        while (i<j){
//            if(word.charAt(i)!=word.charAt(j))
//                return false;
//                i++;
//                j--;
//
//            }
//
//        return true;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////
////
////      String str = "soos";
////      if(Palindrome(str)){
////          System.out.println("Palindrome");
////
////      }else {
////          System.out.println("not ");
////      }
////    }
////
////    public static boolean Palindrome(String str) {
////
////        int i = 0;
////        int j = str.length() - 1;
////
////        while (i < j) {
////            if (str.charAt(i) != str.charAt(j))
////                return false;
////            i++;
////
////            j--;
////
////        }
////
////
////        return true;
////    }
////}
////
