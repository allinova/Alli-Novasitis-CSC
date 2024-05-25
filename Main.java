import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Demonstrating fixed size Arrays
        int[] intArray = new int[5]; 
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        // intArray[5] = 60; 
        System.out.println("Array Elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Demonstrating ArrayLists and how you can resize them
    
        ArrayList<Integer> intArrayList = new ArrayList<>(); 
        intArrayList.add(10); 
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);
        intArrayList.add(60); 
        System.out.println("\nArrayList Elements:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i)); // Accessing elements 
        }

        // Demonstrating the flexibility of the ArrayList
        intArrayList.remove(2); // Removing element 
        intArrayList.add(2, 35); // Adding element at 

        System.out.println("\nModified ArrayList Elements:");
        for (Integer elem : intArrayList) {
            System.out.println(elem); 
        }

        // Size comparison
        System.out.println("\nSize of Array: " + intArray.length);
        System.out.println("Size of ArrayList: " + intArrayList.size());
    }
}
