//enter the age of a person if the age is 18 or more then
// print u are adult otherwise minor using conditional operator
import java.util.Scanner;
class thirtysix{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the age of a person");
        int age=obj.nextInt();
      String str;
        str= (age >=18)?"YOU ARE ADULT":"YOU ARE MINOR" ;
        System.out.println(str);

    }

}