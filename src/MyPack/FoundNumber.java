package MyPack;
public class FoundNumber {
    public static void main(String[] args) {
        int a[]={30,50,60};
        System.out.println(search(a,50));

    }

    public static boolean search(int arr[],int val){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                System.out.println("The element is :"+" "+i);
                return true;
            }

        }
        System.out.println("Value was not found");
        return false;

    }
}

//ssssded
