import java.util.Scanner;

class Interest {

    public double totalAmount(double a, double b,  int c)
    {
       double amount  = (b/100);
       amount = amount*a*c;
       return amount+a;
    }
    public double totalInterst(double a, double b,  int c){
        double amount  = (b/100);
        amount = amount*a*c;
        return amount;
    }
    
}
class SimpleInterest {
public static void main (String a[]){
Interest Intcalc = new Interest();
System.out.println("Please Enter Principle Amount :");
Scanner scana = new Scanner(System.in);
 double pamount = scana.nextDouble();
 Scanner scanb = new Scanner(System.in);
System.out.println("Please Enter Interst rate (%) :");
double Iamount = scana.nextDouble();

System.out.println("Please Enter Year :");
Scanner scanc = new Scanner(System.in);
int year = scanc.nextInt();
System.out.println("Total Amount is : "+ Intcalc.totalAmount(pamount,Iamount,year));
System.out.println("Total Interest is : "+ Intcalc.totalInterst(pamount,Iamount,year));
}

}