package hash;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> shape = new HashSet<String>();
        shape.add("Circle");
        shape.add("Square");
        shape.add("Triangle");
        shape.add("Cone");
        System.out.println("The list created in alphabetical order contains following shapes: "+shape);
        String[] n = shape.toArray(new String[shape.size()]);
        System.out.println("Index number 3 is of " +n[3]+" as per the array created.");
        System.out.println("Index number 2 is of " +n[2]+" as per the array created.");
        System.out.println("Index number 1 is of " +n[1]+" as per the array created.");
        System.out.println("Index number 0 is of " +n[0]+" as per the array created.");
    }
}
