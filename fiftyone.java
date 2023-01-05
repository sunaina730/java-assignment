//find sumand print as sum=_+_=?ss
import java.util.Scanner;
class fiftyone{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("enter first integer");
        int a=input.nextInt();
        System.out.println("enter second integer");
        int b =input.nextInt();
        int c=a+b;
        System.out.println("sum="+a+"+"+b+"="+c);
    }
}