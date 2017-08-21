import java.util.Scanner;
class whileloop1{
	public static void main(String[] args){
	int n;
	Scanner input=new Scanner(System.in);
	System.out.println("input a number");
	while ((n=input.nextInt())!=0){
		System.out.println("You entered "+n);
		System.out.println("Input a number");
		}
	System.out.println("Out of loop");
	}
}
