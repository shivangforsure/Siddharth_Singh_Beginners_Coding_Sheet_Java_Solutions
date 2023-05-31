import java.util.Scanner;
import java.lang.Math;
public class q10 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base: ");
        int base=sc.nextInt();
        System.out.println("Enter exponent: ");
        int exp=sc.nextInt();
        System.out.println(base+" raised to the power "+exp+" is "+(int) Math.pow(base,exp));
sc.close();
    }
}
