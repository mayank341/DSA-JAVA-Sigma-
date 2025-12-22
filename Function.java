// import java.util.Scanner;

// public class Function {
//     public static void printHareKrishna(){
//         System.out.println("hare KRIshna");
//         System.out.println("hare KRIshna");
//         System.out.println("hare KRIshna");
//         System.out.println("hare KRIshna");
//         return;
//     }
//     public static int calculateSum(int a,int b){// formal parameters ,paramteres 

//         int sum=a+b;
//         //System.out.println("the sum is :"+sum);
//    return sum;

//     }

//     public static void main(String[] args) {
//         //body 
// //   printHareKrishna();// function call 
//  Scanner sc=new Scanner(System.in);
//   int a=sc.nextInt();
//   int b=sc.nextInt();
// // calculateSum(a,b);// function call
// int sum=calculateSum(a,b);// actual parametrs or argument 
// System.out.println("sum is :"+sum);
//     }
// }

// ----------------------------------------------------------------------------------
// SWAP ,CALL BY VALUE :
public class Function {

    // SWAPING OF TWO NUMBERS BY USING CALL BY VALUE :
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is  :" + a);
        System.out.println("b is :" + b);
        return;
    }

    // FACTORIALL OF FUNCTION :USING CALL BY VALUE -
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
// BINNOMIAL COEFFICIENT :
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    // SUM OF TWO AND THREE NUMBERS :
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    // PRIME NUMBER OR NOT :
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    // PRIME NUMBER IN A RANGE :
    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }    public static void main(String args[]) {
        // SWaPING :
        // int a=12345;
        // int b=99999;
        // swap(a,b);

        // FACTORIAL :
        //System.out.println(factorial(5));

        // BINOMIAL COEFFICIENT -USING CALL BY VALUE :
    //    System.out.println("binomail coefiicient :" + binCoeff(5, 2));

        // sum of two numbers ,three numbers:
        //System.out.println(sum(3,5));
      //  System.out.println(sum(3,4,5));
        // prime no:call
      //  System.out.println("the number is :"+isPrime( 455));
    
    // call to range of prime number :
    System.out.println("the prime number lies between given range is:"+isPrime(100));
    }

}
// --------------------------------------------------------------------------------------------------------------------------------
