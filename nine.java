import java.util.Scanner;
class nine{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the annual family income");
        int income=obj.nextInt();
        System.out.println("enter the age of a person");
        int age=obj.nextInt();
        if((income>=100000 && income<=200000 ) && (age>=18 && age<=24))
        System.out.println("eligible for scholarship");
        else
        System.out.println("not eligible for scholarship");
        

        }
}