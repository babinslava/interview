/**
 * Created by Slava on 02.01.2017.
 */
public class Q2 {
        public static void main(String[] args)  {
                    Integer i = new Integer(0);
                    String s = new String();

            Integer i3 = 127;
            Integer i4 = 127;
            System.out.println(i3 == i4);

            Integer i1 = -129;
            Integer i2 = -129;
            System.out.println(i1 == i2);
            System.out.println(i1.equals(i2));
            //System.out.println(null);
        }
}
