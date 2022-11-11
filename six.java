import java.util.Scanner;
class six{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the integer num");
        int num=obj.nextInt();
        if(num >0)
        System.out.println("positive");
        else
        System.out.println("negative");
        if(num==0)
        System.out.println("neither positive nor negative");
        
    }

}