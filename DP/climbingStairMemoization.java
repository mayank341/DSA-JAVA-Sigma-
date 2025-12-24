public class climbingStairMemoization{
    public static int climbingStairs(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=0){
            return ways[n];
        }
        ways[n]=climbingStairs(n-1,ways)+climbingStairs(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5; // Number of stairs
        int[] ways = new int[n + 1];
        System.out.println("Number of ways to climb " + n + " stairs: " + climbingStairs(n, ways));
    }
}