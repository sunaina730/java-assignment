import java.util.Scanner;
class third{
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the integer num");
        int num =obj.nextInt();
        if(num % 2 ==0)
        System.out.println("even num");
        else
        System.out.println("odd num");
        


    }
}
