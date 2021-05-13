public class ConnectedList {
    public static void main(String[] args) {

        Box head = new Box(1);
        head.next =null; //head-->null

        Box box1 =new Box(2); //-->

        box1.next = head; //box1-->null

        head=box1; //head-->box1-->null


        Box box2 =new Box(3); //Box2-->

        box2.next =head; //box2-->box1-->null
        head=box2; //head-->box2-->box1-->null

        Box box3 = new Box(4);//Box3-->
        box3.next =head; // box3-->box2-->box1-->null
        head=box3; //head-->box3-->box2-->box1-->null

        while (head!=null){

            System.out.println(head.Number);
            head=head.next;
        }




    }

}





  class Box{
    public int Number;
    public Box next;

    public  Box (int n){
        Number=n;

    }



}
