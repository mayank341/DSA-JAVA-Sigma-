import java.util.HashMap;
import java.util.Set;

public class iterate {
        public static void main(String[] args){
            HashMap<String,Integer> hm=new HashMap<>();

            hm.put("india",100);
            hm.put("us",50);
            hm.put("china",150);
            System.out.println(hm);

            // iterate ::
            Set<String> keys=hm.keySet();
            System.out.println(keys);

for (String k:keys){
    System.out.println("keys:"+k+",value:"+hm.get(k));
}
        }

    
}
