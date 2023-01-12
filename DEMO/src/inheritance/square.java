package inheritance;
public class square extends shape {
    int side;
    public void printarea(){
        System.out.println("Area of Square is "+side*side);
    }

    public void printperimeter(){
        System.out.println("Perimeter of Square is "+4*side);
    }
    public square(int sides, int side) {
        super(sides);
        this.side= side ;
    }
}

