package SET.TreeSet;
// COUNT THE DISTINCT ELEMENTS ::


import java.util.*;
public class CountNo {


    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,8,9,11};
        TreeSet<Integer> ts=new TreeSet<>();

        for(int i=0;i<num.length;i++){
            ts.add(num[i]);
        }
        System.out.println(ts.size());
    }
    
}
