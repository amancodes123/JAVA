import java.util.Scanner;

public class fabbonacci {
    


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
int a = 0,b=1,c;
System.out.print(b+" ");
for(int i=1;i<input;i++){
	
    c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
}
		
	}

}


