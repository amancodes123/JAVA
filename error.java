 // error  1.Compile time error
 //          2.Runtime error
//          3.Logical error

public class error {
    public static void main(String[] args) {
         
        int i = 0 ;
        int j = 0;

       // int nums[] = new int[5];
      //  String str = null;

        try
        {
            j= 18/i;
            if(j==0)
                throw new ArithmeticException("I dont want to show zero");
         //   System.out.println(str.length());
         //   System.out.println(nums[1]);
           // System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            j= 18/1;
            System.out.println("thats the default output  "+ e );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("stay in your limit");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong.. "+ e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
