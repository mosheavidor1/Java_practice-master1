import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoubleWords{
    public static void main(String[] args) throws FileNotFoundException {
        Double();

    }

public static void Double() throws FileNotFoundException {
    File path = new File("C:\\Users\\moshe\\Desktop\\duplicated_words.txt");
    Scanner scan = new Scanner(path);
    String text = scan.nextLine();
    String words[]=text.split(" ");
    Map<String,Integer> counter= new HashMap<String, Integer>();
    for (int i=0;i<words.length;i++) {
        if (counter.containsKey(words[i])) {
            counter.put(words[i], counter.get(words[i]) + 1);
        } else {
            counter.put(words[i], 1);
        }
    }
        Set<String> execute= counter.keySet();
        for(int i=0;i<execute.size();i++){
            if(counter.get(words[i])>1){
                System.out.println(words[i]+": "+counter.get(words[i]));

        }
    }

    }
}












//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//
//public class DoubleWords {
//
//    public static void main(String[] args) throws FileNotFoundException {
//duplicateWords();
//    }
//
//
//
//
//
//
//
//    public static void duplicateWords() throws FileNotFoundException {
//        File path = new File("C:\\Users\\moshe\\Desktop\\duplicated_words.txt");
//        Scanner scan = new Scanner(path);
//        String text = scan.nextLine();
//
//        String words[] = text.split(" ");
//
//        Map<String, Integer> counter = new HashMap<String, Integer>();
//
//        for (int i = 0; i < words.length; i++) {
//            if (counter.containsKey(words[i])) {
//     counter.put(words[i],counter.get(words[i])+1);
//
//
//
//            } else {
//                counter.put(words[i], 1);
//            }
//        }
//        Set<String> StringWords = counter.keySet();
//
//            for (int i = 0; i < StringWords.size(); i++) {
//                if (counter.get(words[i]) > 1) {
//                    System.out.println(words[i] + " : " + counter.get(words[i]));
//            }
//
//        }
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
////
//
//
//
////        File file_Path = new File("C:\\Users\\moshe\\Desktop\\duplicated_words.txt");
////
////        Scanner file_reader = new Scanner(file_Path);
////        while (file_reader.hasNextLine()) {
////            String text = file_reader.nextLine();
////
////            String a[] = text.split(" ");
////
////            Map<String, Integer> counter = new HashMap<String, Integer>();
////
////            for (int i = 0; i < a.length; i++) {
////
////                if (counter.containsKey(a[i])) {
////                    counter.put(a[i], counter.get(a[i]) + 1);
////
////                } else {
////                    counter.put(a[i], 1);
////                }
////            }
////
////            Set<String> StringWords = counter.keySet();
////
////            for (int i = 0; i < StringWords.size(); i++) {
////                if (counter.get(a[i]) > 1) {
////                    System.out.println(a[i] + " : " + counter.get(a[i]));
////                }
////            }
////        }
////    }
////}
////
//
//
//
//
//
//
//
//
//
