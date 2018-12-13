class Node{
 private int data;
 private Node next,prev;

 public Node(Node referencefrom, int num,Node referenceto){
   data=num;
   next=referenceto;
   prev=referencefrom;
 }
 class MyLinkedList{
 private int size;
 private Node start,end;

 public MyLinkedList(int len, Node first, Node last){
   size=len;
   first=start;
   end=last;
 }
 public int size(){
   return size;
 }
 /*public boolean add(int value);{

 }
 public String toString();{

 }*/
}




}
