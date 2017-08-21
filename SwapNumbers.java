import java.util.Scanner;

class SwapNumbers
{
	public static void main(String args[]){
	int x,y ,tmp;
	System.out.println("Enter x and y");
	Scanner in =new Scanner(System.in);

	x=in.nextInt();
	y=in.nextInt();

	System.out.println("Before Swapping\nx ="+x+"\ny = "+y);

	tmp=x;
	x=y;
	y=tmp;
	System.out.println("After Swapping\nx ="+x+"\ny = "+y);

	}
}
