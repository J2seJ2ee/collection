
import java.util.TreeSet;

public class TreeSet1 {
 public static void main(String[] args) {
     TreeSet<StringBuffer> ts= new TreeSet<StringBuffer>();
     ts.add(new StringBuffer("D"));
     ts.add(new StringBuffer("C"));
     ts.add(new StringBuffer("B"));
     ts.add(new StringBuffer("A"));
     ts.add(new StringBuffer("F"));
     ts.add(new StringBuffer("G"));
     
     for(StringBuffer s : ts)
         System.out.println(s);
 }
    
}
