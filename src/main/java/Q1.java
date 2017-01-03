import com.sun.istack.internal.Nullable;

/**
 * Created by Slava on 02.01.2017.
 */
public class Q1 {
    @Nullable
    Integer GetValue()
        {
            return (true ? null : 0);
        }

        public static void main(String[] args)  {
            Q1 obj = new Q1();
            obj.GetValue();
        }
}
