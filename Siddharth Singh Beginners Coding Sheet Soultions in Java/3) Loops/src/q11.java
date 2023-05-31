import java.util.*;
//import java.lang.Math;
public class q11 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base: ");
        int base=sc.nextInt();
        System.out.println("Enter exponent: ");
        int exp=sc.nextInt();
        int mul=1;
        for(int i=1;i<=exp;i++){
            mul*=base;
        }
        System.out.println(base+" raised to the power "+exp+" is "+mul);
        sc.close();
    }
}
