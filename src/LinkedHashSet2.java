
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
 public static void main(String[] args) {
     LinkedHashSet<StringBuffer> lhs = new LinkedHashSet<StringBuffer>();
     lhs.add(new StringBuffer("A"));
     lhs.add(new StringBuffer("D"));
     lhs.add(new StringBuffer("C"));
     lhs.add(new StringBuffer("B"));
     lhs.add(new StringBuffer("E"));
     lhs.add(new StringBuffer("E"));
     lhs.add(new StringBuffer("F"));
     
     for(StringBuffer s : lhs)
         System.out.println(s);
 }
    
}
