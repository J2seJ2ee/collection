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
    ArrayList<String> al1 = new ArrayList<String>();
    al1.add("Cheeku");
    al1.add("Peeku");
    al1.add("Rinku"); 
    
    ArrayList<String> al2 = new ArrayList<String>();
    al2.add("Cheeku");
    al2.add("Lilu");
    al2.add("Nilu");   
    
    ArrayList<String>al3 = new ArrayList<String>();
    al3.add("Cheeku");
    al3.add("Chinu");
    al3.add("Minu");
  
    al3.addAll(al1);
    al3.addAll(al2);
    System.out.println(al3);
    
    //al3.removeAll(al1);
    al3.retainAll(al1);
    System.out.println(al3);   
  }
}
