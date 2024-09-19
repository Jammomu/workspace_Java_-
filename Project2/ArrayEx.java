import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayEx {
  void method(){
    ArrayList list = new ArrayList<>(10);
    list.add(new Integer(5));
    list.add(new Integer(4));
    list.add(new Integer(2));
    list.add(new Integer(0));
    list.add(new Integer(1));
    list.add(new Integer(3));

    System.out.println(list);
    
    ArrayList list2 = new ArrayList<>(list.subList(1, 4));
    System.out.println(list2);
    
    Collections.sort(list);
    System.out.println(list);
    
    list2.add("B");
    list2.add("C");
    list2.add(3, "A");
    System.out.println(list2);
    
    list2.set(3, "AA");
    System.out.println(list2);
    
    int target = 4;
    Boolean res = list2.contains(target);
    System.out.println(res);
    
    res = list.containsAll(list2);
    System.out.println(res);
    
    target = 3;
    String item = (String)list2.get(target);
    System.out.println(item);
    
    int length = list2.size();
    System.out.println(length);
    
    target = 3;
    list2.remove(target);
    System.out.println(list2);
    
    list2.clear();
    System.out.println(list2);

  }
}
