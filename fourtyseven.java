//swap value without using third variable
import java.util.Scanner;
class fourtyseven{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int a=10;
        int b=20;
        System.out.println("swap value");
        a=b;
        b=a;
        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}