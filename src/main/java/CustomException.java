public class CustomException extends Exception {
    String message;
    CustomException( String m){
        message=m;
    }
    void printMessage(){
        System.out.println(message);
    }
    public static void main(String a[]){
        try{
            throw new CustomException("Error!");
        }
        catch (CustomException e){
            e.printMessage();
        }
    }
}
