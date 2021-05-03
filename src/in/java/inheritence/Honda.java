package in.java.inheritence;

public class Honda extends Bike {
    void run(){System.out.println("running safely");}
    @Override
    public void safty() {
        System.out.println("Speed under 60");}
}
