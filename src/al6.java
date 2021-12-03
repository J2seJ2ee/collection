import java.util.ArrayList;
class TestMain{
  public static void main(String arg[]){
    ArrayList<String> al1 = new ArrayList<String>();
    al1.add("Cheeku"); // 0
    al1.add("Peeku");// 1
    al1.add("Rinku");// 2 
    al1.add("Rahil");// 3
    al1.add("Sahil");//4
    al1.add("Cheeku");//5
    //System.out.println(al1);
  
    for(int i=0; i<al1.size(); i++){
      String dataElement = al1.get(i);
      System.out.println(dataElement);
    }
  }
}
