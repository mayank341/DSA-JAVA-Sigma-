import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps{
    public static void main(String[] args) {
        // Arrays.sort();
        // reverse sort -Comparator.reverseOrder()
        //  Arrays.sort(arr, Comparator.reverseOrder());
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.add(4);
        pq.add(3);//0(logn)
        pq.add(2);
        pq.add(24);
        pq.add(4988);
        while(!pq.isEmpty()){
             System.out.println(pq.peek());//0(1)
             pq.remove();//0(logn)
        }
    }
}