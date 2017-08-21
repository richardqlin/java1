import java.util.Scanner;
class BreakContinueWhileLoop{
	public static void main(String[] args){
	int n;
	Scanner input=new Scanner(System.in);
	while (true){
		System.out.println("Input a number");
		n=input.nextInt();
		if (n!=0){
			System.out.println("You entered "+n);
			continue;
		}
		else
			break;
	//	System.out.println("You entered "+n);
	}
	}
}
