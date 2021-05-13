public class MissingNumber{
    public static void main(String[] args) {
        int x[]={1,2,3,5};
        System.out.println(Missing(x,4));

    }
    public static int Missing(int a[],int n){
        int size=a.length;

        int total = (n+1)*(n+2)/2;
        for (int i=0;i<size;i++){
            total-=a[i];
        }
        return total;
    }


}















//public class MissingNumber {
//    public static void main(String[] args) {
//
//        int z[]={1,2,3,5};
//        int m = getMiss(z,4);
//        System.out.println(m);
//
//    }
//
//    public static int getMiss(int a[], int n) {
//
//        int total;
//        total = (n + 1) * (n + 2) / 2;
//
//
//        for (int i = 0; i < n; i++)
//            total -= a[i];
//        return total;
//
//    }
//}
////Explain: n is the number of element in this case 4 items.
////if we calculate total we get 15 .
////if we do the sum of all the numbers in the array it is equals to 1+2+3+5= 11.
////if we subtract total-sum we get = 4 which is the missing number :  In this case 15-11=4;
//
