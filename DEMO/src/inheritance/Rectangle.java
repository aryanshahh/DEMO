package inheritance;

public class Rectangle extends shape {
    int width,length;
    public void printarea(){
        System.out.println("Area of rectangle is "+length*width);
    }
    public void printperimeter(){
        System.out.println("Perimeter of Rectangle is "+(length+width)*2);
    }
    public Rectangle(int sides, int length,int width) {
        super(sides);
        this.length=length ;
        this.width=width;
    }
}
