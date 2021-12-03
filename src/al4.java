import java.util.ArrayList;
/*
  public boolean remove(Object val){
  
  }
  public Object remove(int index){
  
  }
  public boolean add(int index, Integer val){
    if(index>this.size())
      throw new IndexOutOfBoundsException();
    else
     add element here..  
  }
*/
class TestMain{
  public static void main(String arg[]){
    ArrayList<Integer> al = new ArrayList<Integer>(20);
    al.add(1);
    al.add(5);
    al.add(5);
    al.add(7);
    al.add(9);
    al.add(8);
    al.add(2);
    al.add(17,5000);
    System.out.println("Berfore : "+al);
    //al.remove(5);
    al.remove(new Integer(5));
    System.out.println("After : "+al);
  }
}
