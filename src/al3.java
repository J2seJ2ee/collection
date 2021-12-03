import java.util.ArrayList;
class TestMain{
  public static void main(String arg[]){
    ArrayList<Integer> al = new ArrayList<Integer>(20);
    al.add(10);
    al.add(10);
    al.add(20);
    al.add(20);
    al.add(5);
    al.add(5);
    al.add(25);
    al.add(1,1000);
    System.out.println("Total Element : "+al.size());  
    
    al.add(8,2000);
    System.out.println(al);
  }
}
