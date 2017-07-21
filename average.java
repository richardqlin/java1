import java.util.Scanner;
class average{
   public static void main(String[] args){
      int count=0;
      double sum=0.0;
	double value;
	int number;
	Scanner in = new Scanner(System.in);
	for (value=0;value!=1;value++) {
		 value=in.nextDouble();
	System.out.println(value);

		sum+=value;
		count++;
	}
	double avg=sum/count;
	System.out.println("Average is "+avg);


}
}
