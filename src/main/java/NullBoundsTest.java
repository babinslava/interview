public class NullBoundsTest
{
    public static void main(String args[]){
        try {
            int arr[]={1,2,3};
            arr[2]=arr[5];

            Integer i = null;
            i.toString();
        }
        catch (NullPointerException e){
            System.out.println("Null!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException!");
        }
    }
}
