import java.util.Scanner;

class OddEven

{
	public static void main(String args[]){
	int x;
	System.out.println("Enter a number to check if it is odd or even ");
	Scanner in =new Scanner(System.in);
	x=in.nextInt();

	if (x%2 ==0)
		System.out.println("You enter an even number.");
	else
		System.out.println("You enter an odd number.");
	}
}
