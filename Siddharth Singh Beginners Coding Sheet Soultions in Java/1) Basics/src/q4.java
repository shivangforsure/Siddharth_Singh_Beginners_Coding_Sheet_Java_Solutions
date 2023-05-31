import java.util.Scanner;
public class q4 {
    public static void main(String [] args){
        System.out.println("Enter dividend: ");
        Scanner sc=new Scanner (System.in);
        int dividend=sc.nextInt();
        System.out.println("Enter divisor: ");
        int divisor=sc.nextInt();
        System.out.println("The Quotient is "+ dividend/divisor);
        System.out.println("The remainder is "+ dividend%dividend);


    }
    
}
