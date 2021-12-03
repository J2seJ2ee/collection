
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap2 {
  public static void main(String[] args) {
      LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
      lhm.put(100, "A");
      lhm.put(105, "B");
      lhm.put(102, "C");
      lhm.put(106, "D");
      lhm.put(104, "E");
      lhm.put(101, "F");
      lhm.put(null,"g");      
      for(Map.Entry<Integer,String>e : lhm.entrySet())
          System.out.println(e.getKey()+" "+e.getValue());
  }
    
}
