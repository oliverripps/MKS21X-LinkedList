class MyLinkedList{
private int length;
private Node start,end;

public MyLinkedList(){
  start=null;
  end=null;
  length=0;
}

public boolean add(int value){
  if(length!=0){
    Node newend = new Node(end,value,null);
    end.prev().setNext(end);
    length++;
    return true;
}
  else{
    end=new Node(null,value,null);
    start=end;
    length++;
    return true;
  }
}

public int size(){
  return length;
}
public String toString(){
  Node current=start;
  String str = "[";
  for(int i=0;i<length;i++){
    str+=(current.next()).getData();
    if(i<length-1){
    str+=",";
  }
}
  str+="]";
  return str;
}
public Integer get(int index){
  if(index>length || index<0){
    throw new IndexOutOfBoundsException();
  }
  return getNthNode(index).getData();
  /*Node current=start;
  for(int i=0;i<length;i++){
    current=current.next();
  }
  return current.getData();*/
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
public boolean contains(Integer value){
  Node current=start;
  for(int i =0;i<length;i++){
    if (current.getData()==value){
      return true;
    }
    current=current.next();
  }
  return false;
}

public int indexOf(Integer value){
  Node current=start;
  int indof=-1;
  for(int i =0;i<length;i++){
    if (current.getData()==value){
      indof=i;
      }
    current=current.next();
    }
  return indof;
  }
/*public void add(int index, Integer value){
  Node current= start;
  for(int i =0;i<index+1;i++){
  current=current.next();
}
  Integer olddata=current.getData();
  current.setData(value);
  return olddata;
  length++;
}
public boolean remove(Integer value){

}*/
//EXCPETIONS!!!
}
