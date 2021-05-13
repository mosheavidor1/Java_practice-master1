
package MyPack;


import java.util.Arrays;



public class SumOfTwo {

    public static void main(String[] args) {

        int a[]={5,7,4,100};
       int result[] = sum(a,104);
        System.out.println(Arrays.toString(result));

    }

    public static int[]sum(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int [] {i,j};

                }
            }
        }

        throw new IllegalArgumentException("No solution found");
    }
}
