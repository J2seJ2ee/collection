
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
  public static void main(String[] args) {
      TreeMap<Integer,String> tm = new TreeMap<>();
      tm.put(10, "A");
      tm.put(40, "C");
      tm.put(20, "E");
      tm.put(30, "B");
      tm.put(60, "D");
      tm.put(50, "F");
      tm.put(50, "G");
      tm.put(null,"H");
      for(Map.Entry<Integer,String> e : tm.entrySet())
          System.out.println(e.getKey()+" "+e.getValue());
  }
    
}
