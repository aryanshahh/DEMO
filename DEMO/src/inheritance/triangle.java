package inheritance;

public class triangle extends shape{
    int height,base,a,b,c;
    public void printarea(){
        System.out.println("Area of triangle is " +(base*height)/2);
    }
    public void printperimeter(){
        System.out.println("Perimeter of Triangle is "+(a+b+c));
    }
    public triangle( int sides, int base,int height , int a,int b, int c) {
        super(sides);
        this.base =base ;
        this.height=height;
        this.a=a;this.b=b;this.c=c;

    }
}

