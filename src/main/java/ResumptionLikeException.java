public class ResumptionLikeException {
    public static void main(String a[]){
        boolean t=true;
        int i=0;
        while(t) {
            try {
                int arr[] = {1, 2, 0, 3, 4, 5, 6};
                int b = 360;
                for (;i<arr.length; i++) {
                    int c=arr[i];
                    System.out.println(b / c);
                }
                t=false;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                i++;
            }
        }

    }
}
