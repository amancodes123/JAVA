import java.util.Scanner;

public class tut6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("1.Add 2.Mul 3.Dev 4.Sub 5.Rem");
        System.out.println("Enter the Choice");
        int choice = sc.nextInt();
        System.out.println("Enter two Numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        switch (choice) {
            case 1:
               int sum = a+b;
               System.out.println(sum);
                break;
            
                case 2:
                int mul = a*b;
                System.out.println(mul);
                break;

                case 3:
                int Dev= a/b;
                System.out.println(Dev);
                break;

                case 4:
                int sub= a-b;
                System.out.println(sub);
                break;

                case 5:
                int rem= a%b;
                System.out.println(rem);
                break;
            default:
            System.out.println("Invalid choice");
                break;
        }
    }
    
}
