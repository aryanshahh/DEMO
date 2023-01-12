package inheritance;
public class circle extends shape{
    int radius;
    public void printarea() {
        System.out.println("Area of Circle is " + 3.14 * radius * radius);
    }
    public void printperimeter(){
        System.out.println("Perimeter of Circle is "+2* Math.PI*radius);
    }
    public circle(int sides,int radius) {
        super(sides);
        this.radius = radius;
    }
}
