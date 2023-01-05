//print swap value using third variable 
import java.util.Scanner;
class fourtysix{
    public static void main(String[]args){
        Scanner obj= new Scanner (System.in);
        int a=10;
        int b=20;
    System.out.println("swap value");
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a"+a);
    System.out.println("b"+b);
    }
}