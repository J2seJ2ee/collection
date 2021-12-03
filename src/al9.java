import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class TestMain{
  public static void main(String arg[]){
    ArrayList<String> al = new ArrayList<String>();
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
    ListIterator<String>lit = al.listIterator(al.size());
    while(lit.hasPrevious()){
      String s = lit.previous();
      System.out.println(s);
    }
    /*
    while(lit.hasNext()){
      String s = lit.next();
      System.out.println(s);
    }
    */
    /*
    Iterator<String> itr = al.iterator();
    while(itr.hasNext()){
      String s = itr.next();
      System.out.println(s);
    } 
    */
  }
}
