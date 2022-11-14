import java.util.Scanner;

import java.util.Scanner;
    class eleven {
        public static void main(String[]args){
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the sale");
            int sale = obj.nextInt();
            double comisn;
            if (sale<=25000){
                comisn = (sale*5)/100;
                System.out.println("comision of the sale" +comisn);
            }
            else if (sale >=25001 && sale <=50000){
                comisn = (sale*7)/100;
                System.out.println("comision of the sale" +comisn);
            }
            else if (sale >=50001 && sale<=75000)
            {
                comisn =(sale*8)/100;
                System.out.println("comision of the sale" +comisn);
            }else
              {
                comisn = (sale*10)/100;
                System.out.println("comision of the sale" +comisn);
            }
                            
        }   
    }
