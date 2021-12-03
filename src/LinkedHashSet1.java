
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
     LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
     lhs.add(50);
     lhs.add(10);
     lhs.add(40);
     lhs.add(20);
     lhs.add(30);
     lhs.add(60);
     for(Integer x : lhs)
            System.out.println(x);
     
    }
    
    
}
