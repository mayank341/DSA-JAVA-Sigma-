package SET.TreeSet;

import java.util.HashSet;

public class Unionarray {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int arr1[]={2,3,5,6,9};
        int arr2[]={9,6,5,2,1};

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union of arr1 and arr2 :"+hs.size());

    }
    
}
