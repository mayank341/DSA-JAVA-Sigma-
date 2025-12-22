package SET.HashSet;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(5);
    System.out.println(set);

    if(set.contains(2)){
        System.out.println("setconatins 2");

    }
    if(set.contains(3)){
        System.out.println("set contains 3");
    }
set.remove(2);
System.out.println(set);

    }
}
