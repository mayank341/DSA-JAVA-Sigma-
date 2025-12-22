
import java.util.*;
public class LargestSubarraywith0sum {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of array:");
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.print("Length of largest subarray with 0 sum is:"+len);
    }
}
