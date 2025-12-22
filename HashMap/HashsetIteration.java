import java.util.*;
public class HashsetIteration { // HashSet is Unoredered Set Function ::
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(9);
        hs.add(11);
        hs.add(15);
        hs.add(21);
        System.out.println(hs);

        // iteration ::
        // Iterator<Integer>it=hs.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(Integer s:hs){
            System.out.println(s);

        }
    }
    
}
