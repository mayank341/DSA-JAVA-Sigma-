import java.util.*;
public class LargestSubarrayKsum {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the k value:");
    int k=sc.nextInt();
    HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    int sum=0;
    int count=0;
    for(int j=0;j<n;j++){
        sum+=arr[j];
        if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
System.out.println("Count of subarrays with sum k is:"+count);

 }   
}