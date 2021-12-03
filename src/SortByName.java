
import java.util.Comparator;


public class SortByName implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
       String o1kanaam = o1.getName();
       String o2kanaam = o2.getName();
       int x = o1kanaam.compareTo(o2kanaam);
       if(x==0)
            return 1;
       return x;
      
    }

    
    
}
