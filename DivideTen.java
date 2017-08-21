import java.util.Scanner;
 
class DivideTen
{
  public static void main(String args[])
  {
    int c;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    c = in.nextInt();
 
    if ( (c/10)*10 == c )
      System.out.println("Dividable by 10");
    else
      System.out.println("No dividable by 10");
  }
}
