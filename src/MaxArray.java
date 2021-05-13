public class MaxArray {

    public static void main(String[] args) {

        int arr[]={1,7,90,55};
        System.out.println(GetMax(arr));

    }

    public static int GetMax(int numbers[]){
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }


}
//    public static void main(String[] args) {
//int a[]={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(getMax(a));
//    }
//
//
//    public static int getMax(int a[]) {
//
//        int Max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > Max) {
//                Max = a[i];
//            }
//        }
//        return Max;
//    }
//}