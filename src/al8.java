/*
  Student
   1. rollno
   2. name
   3. age
   
*/
import java.util.ArrayList;
class Student{
  private int rollNumber;
  private String name;
  private int age;
  public Student(int rollNumber, String name, int age){
    this.rollNumber = rollNumber;
    this.name = name;
    this.age = age;
  }
  public Student(){}
  public int getRollNumber(){
    return rollNumber;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void setRollNumber(int rollNumber){
    this.rollNumber = rollNumber;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String toString(){
    return rollNumber+" "+name+" "+age;
  }
}
class TestMain{
  public static void main(String arg[]){
    ArrayList<Student> al = new ArrayList<Student>();
    Student s1 = new Student(1,"Mubasshir",21);
    Student s2 = new Student(2,"Farhan",24);
    Student s3 = new Student(3,"Raja",26);
    Student s4 = new Student(4,"Nitul",23);
  
    al.add(s1); // 0
    al.add(s2); // 1
    al.add(s3); // 2
    al.add(s4); // 3
    
    /*
    for(int i=0; i<al.size(); i++){
      Student s = al.get(i);
      //System.out.println(s.getRollNumber()+" "+s.getName()+" "+s.getAge());
      System.out.println(s); // s.toString()
    }
    */
    for(Student s : al)
      System.out.println(s);
  }
}
