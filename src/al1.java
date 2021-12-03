/*
  ArrayList()
  ArrayList(int) :- intial capacity
  ArrayList(Collection)
  
  a) Without type safety
     ArrayList al = new ArrayList();
  b) With typesafe
     ArrayList<Integer> al = new ArrayList<Integer>();   
*/
import java.util.ArrayList;
class TestMain{
  public static void main(String arg[]){
    //ArrayList al = new ArrayList(5);
      ArrayList al = new ArrayList();
      al.add(100);
      al.add("Rahil");
      al.add(45.5);
      al.add(true);
      System.out.println(al);
  }
}
