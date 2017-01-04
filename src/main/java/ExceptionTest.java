public class ExceptionTest {


    public static void main(String args[]){
        try{
            throw new Exception("Something is wrong");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am in finally");
        }
    }

}
