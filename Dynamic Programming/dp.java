public class dp {
    public static int fib(int n,int f[]){//memoization kq
        if(n==0 || n==1){
            return n;
        }
       if(f[n]!=0){
        //  fibonacci number already computed
        return f[n];
    }
    f[n]= fib(n-1,f)+fib(n-2,f);
        return f[n];
    }

    public static void main(String[] args) {
        int n=6;
        int f[]=new int [n+1];
        System.out.println(fib(n,f));
    } 
}
