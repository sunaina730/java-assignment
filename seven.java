import java.util.Scanner;
class seven{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the code of integer");
        int a=obj.nextInt();
        if (a==5 || a==7 || a==11 || a==24)
        System.out.println("print right code");
        else
        System.out.println("print wrong code");

    }

}