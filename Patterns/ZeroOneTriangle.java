public class ZeroOneTriangle {
    public static void zero_one_triangle(int n){
        // ouet :
        for (int i =1;i<=n;i++){
            // inner each line :
            for(int  j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");  // Print '1' for even sum of indices
                } else {
                    System.out.print("0 ");  // Print '0' for odd sum of indices
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args) {
        zero_one_triangle(5);  // Call the method with n=5
    }

}
