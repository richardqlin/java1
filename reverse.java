import java.util.Scanner;

class reverse{
	public static void main(String[] args){

		System.out.print("Enter a string: ");
		String str =new String();

		String rev="";

		Scanner in =new Scanner(System.in);

		str =in.nextLine();

		int len=str.length();

		for (int i=len-1;i>=0;i--)
			rev+=str.charAt(i);
	

		System.out.println(rev);
	}
}