import java.util.Scanner;
public class twelve{
    public static void main(String[]args){
    Scanner obj=new Scanner (System.in);
System.out.println("enter the sales");
int sale =obj.nextInt();
if (sale<=25000)
{
    double commision =(sale*5)/100;
    System.out.println("commision=" +commision+"rs");

}
else
{
    double commision =(sale*7)/100;
    System.out.println("commission=" +commision+"rs");
}
    }
}