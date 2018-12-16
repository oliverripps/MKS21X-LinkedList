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
private Node getNthNode(int N){
  Node current=start;
  Node next=start.next();
  for(int i=0;i<N;i++){
    current=current.next();
    next=current.next();
  }
  return current;
}

public Integer get(int index){
  if(index>length || index<0){
    throw new IndexOutOfBoundsException();
  }
  return getNthNode(index).getData();

}
public Integer set(int index, Integer value){
  if(index>=0 && index<=length-1){
    Integer valuebefore;
    Node spot = getNthNode(index);
    valuebefore=spot.getData();
    spot.setData(value);
    return valuebefore;
}
  else{
    throw new IndexOutOfBoundsException();}
}

public boolean contains(Integer value){
  Node current=start;
  for(int i =0;current!=null;i++){
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
