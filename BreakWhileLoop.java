import java.util.Scanner;
class BreakWhileLoop{
	public static void main(String[] args){
	int n;
	Scanner input=new Scanner(System.in);
	while (true){
		System.out.println("Input a number");
		n=input.nextInt();
		if (n==0)
			break;
	System.out.println("You entered "+n);
	}
	}
}
