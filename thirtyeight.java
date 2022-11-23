import java.util.Scanner;
class thirtyeight{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the sales");
        int a=obj.nextInt();
        double commission=(a<=2500)?(a*5)/100:(a*7)/100;
        System.out.println(commission);
    }
}
    