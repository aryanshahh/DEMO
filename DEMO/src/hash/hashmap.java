package hash;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> shapes =new HashMap<String,Integer>();
        shapes.put("Circle",0);
        shapes.put("Line",1);
        shapes.put("Square",4);
        shapes.put("Triangle",3);
        shapes.put("Rectangle",4);
        shapes.put("Pentagon",5);
        shapes.put("Hexagon",6);

        for(String i:shapes.keySet()){
            System.out.println("The shape is "+i+" having "+shapes.get(i)+" sides");
        }
    }
}

