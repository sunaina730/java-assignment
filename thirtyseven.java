//enter any integer then check and print
//whether it is odd no. or even no. using conditional operator
import java.util.Scanner;
class thirtyseven{
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the any integer number");
    int number=obj.nextInt();
    String str;
    str=(number%2==0)?"it is even number":"it is odd number" ;
    System.out.println(str);   
    }
}