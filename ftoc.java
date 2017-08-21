import java.util.*;

class ftoc {

	public static void main(String args[])
	{
		float temp;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter termperature in Fahernheit");
		temp=in.nextInt();

		temp=(temp-32)*5/9;
		System.out.println("Temperature in Celsius ="+temp);

	}
}
