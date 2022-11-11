import java.util.Scanner;
class ten {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the marks of first subject");
        int first=obj.nextInt();
        System.out.println("enter the marks of second subject");
        int second=obj.nextInt();
        System.out.println("enter the marks of third subject");
        int third=obj.nextInt();
        double average=(first +second+third)/3;
        if(average >60)
        System.out.println("first devision");
        if(average >45 && average<60)
        System.out.println("second devision");
        if(average >33 && average <60)
        System.out.println("third devision");
        if(average<33)
        System.out.println("fail");
        


    }
}