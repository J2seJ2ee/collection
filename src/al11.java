import java.util.ArrayList;
import java.util.Collections;
class Employee{
  private int id;
  private String name;
  private int salary;
  private int age;
  public Employee(int id, String name, int salary, int age){
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.age = age;
  }
}
class TestMain{
  public static void main(String arg[]){
    ArrayList<Employee> al = new ArrayList<Employee>();
    al.add(new Employee(1,"A",20000,21));
    al.add(new Employee(2,"B",30000,24));
    al.add(new Employee(3,"D",40000,25));
    al.add(new Employee(4,"C",90000,29));
  
    Collections.sort(al);
    
    for(Employee e : al)
      System.out.println(e);
  }
}
