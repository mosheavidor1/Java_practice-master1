public  class Array_find_secondLargeIN_Array {

    public static void main(String[] args) {

        int a[] = {1, 5, 8, 4, 3};
        int temp;
        int size = a.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                     temp =a[i];
                     a[i]=a[j];
                     a[j]=temp;

                }

            }


        }
        System.out.print(a[size-2]);


    }
}
//
//
//
//    public static void main(String args[]) {
//
//        int a[] = {1, 3, 6, 300, 45, 9};
//        int size = a.length;
//        int temp;
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//
//        }
//        System.out.println(a[size-2]);
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
////int a[]= {1,2,3,60,5,6,7,8,9,100};
////int size = a.length;
////
////for(int i =0 ; i<size;i++){
////    for(int j=i+1;j<size;j++){
////        if(a[i]>a[j]){
////           a[i]=a[j];
////
////        }
////    }
////}
////
////        System.out.println(a[size-2]);
//
//
//
//
//    //}
//
//
//
//
////        int temp, size;
////        int array[] = {10, 20, 25, 63, 96, 57};
////        size = array.length;
////
////        for(int i = 0; i<size; i++ ){
////            for(int j = i+1; j<size; j++){
////
////                if(array[i]>array[j]){
////                    temp = array[i];
////                    array[i] = array[j];
////                    array[j] = temp;
////                }
////            }
////        }
////        System.out.println("Third second largest number is:: "+array[size-2]);
////    }
////}
