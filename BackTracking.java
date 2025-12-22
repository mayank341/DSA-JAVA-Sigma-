// ## BACKTRACKING OF ARRAYS :// This code demonstrates a simple backtracking algorithm that modifies an array.
// The algorithm fills the array with increasing values and then backtracks to modify the values.

// public class BackTracking {
//     public static void changeArr(int arr[],int i,int val){
//           // base case :
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }   
//         // Recursion :
//         arr[i]=val;
//         changeArr(arr,i+1,val+1);
//         arr[i]=arr[i]-2; // Backtracking step
//     }
     
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]=new int [5];
//         changeArr(arr,0,1);
//         printArr(arr);
//     } 
// }
// -------------------------------------------------------------------------------------------------------------------------------
// ## Find Backtracking of SUBSETS :
// find and print all subsets of a given string "abc":

// public class BackTracking{
//     public static void FindSubset(String str,String ans,int i){
//         // Base Case :
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("Empty Set");
//             } else {
//                 System.out.print(ans);
//             }
//             return;
//         }
//     FindSubset(str,ans+str.charAt(i),i+1);
//     FindSubset(str,ans,i+1);
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         FindSubset(str," ",0);
//     }
// }
// ------**---------------------- ** ------------------------------**---------------------**----------------------------
// ## Grid Ways of backtracking :
// This code demonstrates a backtracking algorithm to find the number of ways to reach the bottom-right corner of a grid.

public class BackTracking {
    public static int gridWays(int i,int j,int n,int m){
        // Base Case ::
        if(i==n-1&&j==m-1){// cond for last call
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }

int w1=gridWays(i+1,j,n,m);
int w2=gridWays(i,j+1,n,m);
    return w1+w2;
}
    public static void main(String[] args) {
        int n=2,m=2; // Grid size
        System.out.println(gridWays(0,0,n,m)); // Starting from the top-left corner
    }
}
// ------------------------------------- ** ------------------------------**---------------------**----------------------------
// ## N-Queens Problem :
