package MyPack;
public class Missing_Number {
    public static void main(String[] args) {
        Missing_Number m =new Missing_Number();
        int a[]={1,2,3,5};
        System.out.println(Missing(a,5));




    }

    public static int Missing(int arr[],int n) {



        int sum = 11;
        int size= n*(n+1)/2;
        int dif = size-sum;

        for(int i=0;i<arr.length;i++){
            size-=arr[i];


        }



        return dif;

    }

}


