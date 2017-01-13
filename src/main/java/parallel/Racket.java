package parallel;

import java.util.concurrent.TimeUnit;

public class Racket {
    public static void main(String args[]) throws Exception{
        for (int i=0; i<5; i++){
            Liftoff l = new Liftoff();
            Thread t = new Thread(l);
            t.setDaemon(true);
            t.start();
        }
        TimeUnit.MILLISECONDS.sleep(3);
    }
}
