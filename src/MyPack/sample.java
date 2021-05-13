package MyPack;

//Growth methods of big O :
//constant O(1)
//Logarithmic o(log n)
//Linear O(n)
//Quadratic O(n^2)
//Exponential O(2^n)


import java.sql.Array;

public class sample {


    public static void main(String[] args) {






//        int a[]={0,1,2,3,4,5,6,7,8,9,10};
////        System.out.println(log(a));
////        System.out.println(log2(a));
//        System.out.println(log3(a));
//    }
////o(1) - big O complex is 1 . This function grows constantly.
//    public static boolean log(int[]numbers){
//        System.out.println(numbers[0]);
//        return true;
    }
// o(n) - complex is linear .
    public static boolean log2(int[]numbers){
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
        for(int number:numbers){
            System.out.println(number);
        }
        return true;
    }

    public static boolean log3(int[]numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[10]);
        }
        return true;
    }


}