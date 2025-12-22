
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i; // return the index of the key
            }
        }
        return -1; // return -1 if key is not found
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;

        int index=linearSearch(numbers, key);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
