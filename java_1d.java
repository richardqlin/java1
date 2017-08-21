import java.util.*;

public class java_1d {
	public static void main(String[] args){

		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int [] myArray=new int[n];
		for (int i=0;i<n;i++){
			int val =scan.nextInt();
			myArray[i]=val;
		}
		scan.close();

		for (int i =0;i<n;i++)
			System.out.println(myArray[i]);

	}
}