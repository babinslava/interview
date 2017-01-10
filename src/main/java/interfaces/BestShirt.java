package interfaces;

/**
 * Created by Slava on 10.01.2017.
 */
public class BestShirt implements Shirt {
    String color;

    public BestShirt(String color) {
        this.color = color;
    }

    @Override
    public void wear() {
        System.out.println("I wear "+color+" shirt");
    }

    @Override
    public void iron() {
        System.out.println("I iron "+color+" shirt");
    }

    @Override
    public void wash() {
        System.out.println("I wash "+color+" shirt");
    }

    @Override
    public void button() {
        System.out.println("I button "+color+" shirt");
    }

    public static void main(String args[]){
        Clothes s = new BestShirt("black");
        s.wear();
    }
}
