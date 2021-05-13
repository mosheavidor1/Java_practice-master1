public class Fibonaci {

    public static void main(String[] args) {


        int arr[] = new int[10];
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for (int i=0;i<arr.length;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);


        }
    }
}





//
//    public static void main(String[] args) {
//
//
//        int Arr[] = new int[10];
//
//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.print(a + " " + b);
//
//        for (int i = 0; i < Arr.length; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            c = a;
//            System.out.print(" " + c);
//
//        }
//    }
//}
//
////int a=0;
////int b=1;
////int size =10;
////        System.out.print(a+" "+b);
////        for(int i=0;i<size;i++){
////            int c=a+b;
////            a=b;
////            b=c;
////            c=a;
////            System.out.print(" "+c);

//
//
//        int arr[] = new int[10];
//        int a=0,b=1,c;
//        System.out.print(a+" "+b);
//        for (int i=0;i<arr.length;i++){
//            c=a+b;
//            a=b;
//            b=c;
//            System.out.print(" "+c);
//
//
//        }
//    }
//}