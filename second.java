import java.util.Scanner;
class second{
    public static void main(String[]args){
    Scanner obj=new Scanner(System.in);
        System.out.println("enter the marks of first subject");
        int first =obj.nextInt();
        System.out.println("enter the marks of second subject");
        int second =obj.nextInt();
        System.out.println("enter the marks of third subject");
        int third =obj.nextInt();
        System.out.println("enter the marks of avg");
        int avg=obj.nextInt();
        avg=(first+second+third) /3;
        if(avg>=18)
        
        System.out.println("print psss");
        else
        System.out.println("print fail");




    
           

    }
}