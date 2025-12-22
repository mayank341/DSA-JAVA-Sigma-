package SET.TreeSet;
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int arr1[]={2,3,5,6,7,8,9};
        int arr2[]={8,7,5,4,3,2,1};

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr1[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("count Intersection of array:"+count);
    }
    
}
