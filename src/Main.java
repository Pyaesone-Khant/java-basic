import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//              ArrayList = A resizable array that stores objects (autoboxing).
//              Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");

//        fruits.remove(0) //remove "Banana"
//        fruits.set(1, "Coconut"); //set index 1 to Coconut

//        System.out.println(fruits);
//        System.out.println(fruits.size());

        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
