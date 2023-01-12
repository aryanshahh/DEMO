package Thread;

public class cooking implements Runnable{
    public void run() {
        for(int i=0;i<=20;i++) {
            System.out.println("Cooking");
        }
    }
    public static void main(String Args[])
    {
        cooking c=new cooking();
        Thread t1=new Thread(c);
        t1.start();
        for(int i=0;i<=20;i++) {
            System.out.println("Driving the car.. ");
        }
    }
}
