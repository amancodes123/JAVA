import java.util.Scanner;
import java.util.*;

public class tut8 {

    public static void printLetter(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

   public static boolean isPalindrome(String str){
    for(int i =0; i<str.length()/2;i++){
        int n = str.length();
        if(str.charAt(i)!=str.charAt(n-1-i)){
            //not a palindrome
            return false;
        }
    }
    return true;
   }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = "Hero";
        // // name = sc.nextLine();
        // // System.out.println(name);

        // String fullName = "Tony Stark";
        // String full = name + " " + fullName;
        // System.out.println(full);
        String first = "Aman";
        String last = "Bhivgade";
        String full = first + " " + last;
        printLetter(full);

        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    
}
