import java.util.Scanner;

class IfElse {

 public static void main(String[] args){
	int score;
	char grade;

	Scanner input =new Scanner(System.in);
	System.out.println("Input score ");

   	score=input.nextInt();

	if (score >=0 && score <=100){
	if (score >=60){
	if (score <= 100 && score >=90)
		grade = 'A' ;
	else if(score <=89 && score >=80)
		grade='B';
	else if (score <=79 && score >=70)
		grade='C';
	else
		grade='D';
	 System.out.println("You passed the test and your grade is "+grade);	
	}
	else if (score <=59 && score >=0)
        {        grade='F';
	System.out.println("You failed and your grade is "+grade);
	}
	}
	else
	System.out.println("invalid score");

}
}
