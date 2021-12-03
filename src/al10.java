import java.util.ArrayList;
import java.util.Collections;
/*
  Integer
  Float
  Short
  Byte
  Long
  Double
  String
*/
class TestMain{
  public static void main(String arg[]){
    ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
    
    
    al.add(new StringBuffer("E"));
    al.add(new StringBuffer("A"));
    al.add(new StringBuffer("D"));
    al.add(new StringBuffer("C"));
    al.add(new StringBuffer("D"));
    
    Collections.sort(al);
    
    for(StringBuffer data :al)
      System.out.println(data);
  }
}
