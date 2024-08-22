public class tut10 {
    public static void main(String[] args) {
        
        int i=0;
        int j=0;

        try {
            j=18/i;
            if (j==0) {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            j=18/1;
           System.out.println("this is default output");
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong...");
        }
        System.out.println(j);

        System.out.println("Bye");
    }
    
}
 