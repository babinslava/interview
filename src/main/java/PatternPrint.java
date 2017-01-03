/**
 * Created by Slava on 02.01.2017.
 */
public class PatternPrint {
    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<5;i++)
        {
            for(int s=0;s<5-i;s++)
                System.out.print(" ");
            for(int j=0;j<i+1;j++)
            {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }
}
