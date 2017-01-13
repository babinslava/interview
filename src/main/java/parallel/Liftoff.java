package parallel;

public class Liftoff implements Runnable{
    private static int count=0;
    private final int id=count++;
    private int countDown=10;

    void printStatus(){
        System.out.println(Thread.currentThread()+"#"+id+" "+countDown+"!");

    }

    @Override
    public void run() {
        while (countDown>0){
            printStatus();
            countDown--;
            Thread.yield();
        }
    }
}
