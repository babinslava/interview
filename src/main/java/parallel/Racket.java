package parallel;

public class Racket {
    public static void main(String args[]){
        for (int i=0; i<5; i++){
            Liftoff l = new Liftoff();
            Thread t = new Thread(l);
            t.start();
        }
    }
}
