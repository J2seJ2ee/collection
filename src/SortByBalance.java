
import java.util.Comparator;


public class SortByBalance implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
      float x = o1.getTotalBalance() - o2.getTotalBalance();
      if(x == 0)
          return 1;
      return (int)x;
    }
    
}
