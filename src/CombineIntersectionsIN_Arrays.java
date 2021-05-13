//
//
public class CombineIntersectionsIN_Arrays {
    public static void main(String[] args) {



        try {
           int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

  int b[] = {7, 8, 9};


            System.out.println(combine(a, b));

        } catch (Exception e) {

        }
    }

    public static int combine(int a[],int b[]){

       int i=0;
       int j=0;

       while (i<a.length&&j<b.length){
           if(a[i]==b[j]){
               System.out.println(a[i]);
               i++;
               j++;
           }else if(a[i]>b[j]){
               j++;
           }else{
               i++;
           }
       }
    return a[i];
    }

}




