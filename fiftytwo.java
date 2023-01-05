//enter two ineger then check and print
//how many times the first integer can be devided by the second integer
//what will be left
import java.util.Scanner;
public class fiftytwo {
    public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int a = input.nextInt();
    System.out.print("Input the second number: ");
    int b = input.nextInt();
    int d = (a/b);
    System.out.println();
    System.out.println("The division of a and b is:"+d);
}
}