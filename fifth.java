// Enter any integer from 1-3 and print in word
//if the given value is beyond the range than it gives msg out of range
import java.util.Scanner;
class fifth{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any integer from 1-3");
        int a=obj.nextInt();
        if (a==1)
        System.out.println(+a+" =one");
       else if (a==2)
        System.out.println(+a+"=two");
       else if (a==3)
        System.out.println(+a+"three");
        else
        System.out.println("wrong entered");

    }
}