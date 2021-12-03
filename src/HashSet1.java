
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(50);
        hs.add(40);
        hs.add(70);
        hs.add(90);
        hs.add(10);
        hs.add(30);
        hs.add(20);
        hs.add(50); 
        System.out.println("Enter Number To Be Searched....");
        int n = new java.util.Scanner(System.in).nextInt();
        if(hs.contains(n))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
        for(Integer x : hs)
            System.out.println(x); 
                
       
    }
}
