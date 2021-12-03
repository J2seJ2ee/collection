
import java.util.LinkedHashSet;

class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+age; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode()---called...");
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals called....");
        Student s = (Student)obj;
        return this.id == s.id && this.name.equals(s.name);
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
public class LinkedHashSet3 {
  public static void main(String[] args) {
      LinkedHashSet<Student> lhs = new LinkedHashSet<>();
      lhs.add(new Student(1, "Rahil", 24));
      lhs.add(new Student(4, "Sahil", 26));
      lhs.add(new Student(5, "Nikhil", 28));
      lhs.add(new Student(2, "Cheeku", 27));
      lhs.add(new Student(2, "Nikku", 29));
      lhs.add(new Student(3, "Peeku", 21));
      
  
      for(Student s : lhs)
          System.out.println(s);
  }
    
}
