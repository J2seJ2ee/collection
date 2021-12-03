public class Customer implements Comparable<Customer>{
  private int id;
  private String name;
  private int age;
  private float totalBalance;

    public Customer(int id, String name, int age, float totalBalance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.totalBalance = totalBalance;
    }

    public Customer() {
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

    public float getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance) {
        this.totalBalance = totalBalance;
    }
  public String toString(){
      return id+" "+name+" "+totalBalance+" "+age;
  }

    @Override
    public int compareTo(Customer o) {
       return this.id - o.id;   
    }
  
}
