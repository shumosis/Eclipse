import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Merging {
  
    public static void main(String[] args)
    {
       
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        
       
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
  
       
        List<Integer> list3= new ArrayList<Integer>();
  
       
        list3.addAll(list1);
        list3.addAll(list2);
  
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list1+list2: " + list3);
    }
}