
import java.util.TreeSet;

public class TreeSet2 {
  public static void main(String[] args) {
      TreeSet<Customer> ts = new TreeSet<>();
      //TreeSet<Customer> ts = new TreeSet<>(new SortByName());
      //TreeSet<Customer> ts = new TreeSet<>(new SortByBalance());
      ts.add(new Customer(1, "A",21, 600000));
      ts.add(new Customer(5, "D",24, 700000));
      ts.add(new Customer(6, "C",22, 800000));
      ts.add(new Customer(7, "F",27, 650000));
      ts.add(new Customer(2, "E",29, 900000));
      ts.add(new Customer(3, "H",21, 850000));
      ts.add(new Customer(4, "B",30, 600000));
      ts.add(new Customer(9, "C",30, 950000));
  
      for(Customer c : ts)
          System.out.println(c);
  }
    
}
