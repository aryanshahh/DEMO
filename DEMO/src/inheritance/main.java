package inheritance;
public class main {
    public static void main(String[] args) {
        circle c = new circle( 0, 7);
        triangle t =new triangle(3,4,5,6,8,7);
        Rectangle r =new Rectangle(4,5,6);
        square s =new square(4,3);
        c.printarea();
        t.printarea();
        r.printarea();
        s.printperimeter();
        t.printperimeter();
    }
}
