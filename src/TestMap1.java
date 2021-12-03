
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap1 {
  public static void main(String[] args) {
      
      HashMap<Integer,String> hm = new HashMap();
      hm.put(1, "A");
      hm.put(2, "B");
      hm.put(3, "C");
      hm.put(300, "C");
      hm.put(4, "D");
      hm.put(5, "E");
      hm.put(5, "F");
      hm.put(null, "G");
      hm.put(null,"H");        
              
      //System.out.println(hm);
      /*
      Set<Map.Entry<Integer,String>>s = hm.entrySet();
      for(Map.Entry<Integer,String> e : s)
          System.out.println(e.getKey()+" "+e.getValue());
      */
      for(Map.Entry<Integer,String> e : hm.entrySet())
        System.out.println(e.getKey()+ " "+e.getValue());
    }
    
}
