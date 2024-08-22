import java.util.Scanner;

public class tut7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int counter =0;
        // while (counter < 10 ){
        //     System.out.println("Hello World");
        //     counter++;
        // }

        // int i=1;
        // int range=sc.nextInt();
        // while (i<=range){
        //     System.out.println(i);
        //     i++;
        // }

        //print sum of first n natural numbers
        // int n = sc.nextInt();
        // int sum=0,i=1;
        // while (i<=n){
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println(sum);

        //print reverse of a number
        // int n = 10899;
        // while (n>0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n=n/10;
        // }
        // System.out.println();

        int n=10899 , rev =0;
        while (n>0) {
            int lastDigit=n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
