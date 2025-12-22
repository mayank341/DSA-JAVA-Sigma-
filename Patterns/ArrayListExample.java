import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1. Adding Elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("1. After Adding Elements: " + list);

        // 2. Inserting Elements
        list.add(1, 15);
        System.out.println("2. After Inserting 15 at index 1: " + list);

        // 3. Removing Elements
        list.remove(2);
        System.out.println("3. After Removing Element at index 2: " + list);

        // 4. Accessing Elements
        int firstElement = list.get(0);
        System.out.println("4. First Element: " + firstElement);


         // 5. Size of the ArrayList
        System.out.println("5. ArrayList Size: " + list.size());

        // Print the Array List:: 
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

  // 6. Checking if Empty
        System.out.println("6. Is ArrayList Empty? " + list.isEmpty());

        // 7. Clearing the ArrayList
        list.clear();
        System.out.println("7. After Clearing: " + list);
    }
}

