class MyLinkedList{
private int length;
private Node start,end;

public MyLinkedList(){

}

/*public boolean add(int value){
  Node end2=

}*/
public int size(){
  return length;
}
public String toString(){
  Node current=start;
  String str = "{";
  for(int i=0;i<length;i++){
    str+=(current.next()).getData();
    if(i<length-1){
    str+=",";
  }
}
  str+="}";
  return str;
}
public Integer get(int index){
  Node current=start;
  for(int i=0;i<length;i++){
    current=current.next();
  }
  return current.getData();
}
public Integer set(int index, Integer value){
  Node current= start;
  for(int i =0;i<index+1;i++){
  current=current.next();
}
  Integer olddata=current.getData();
  current.setData(value);
  return olddata;
}
/*public boolean contains(Integer value){

}
public int indexOf(Integer value){

}
public void add(int index, Integer value){

}
public boolean remove(Integer value){

}*/
//EXCPETIONS!!!
}
