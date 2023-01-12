package Thread;
public class driving extends Thread {
    public void run() {
        for(int i=0;i<=20;i++) {
            System.out.println("Driving the car.. ");
        }
    }
    public static void main(String Args[])
    {
        driving d=new driving();
        d.start();
        for(int i=0;i<=20;i++) {
            System.out.println("Cooking.. ");
        }
    }
}
