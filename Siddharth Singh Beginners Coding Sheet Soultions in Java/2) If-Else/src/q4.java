import java.util.Scanner;
import java.lang.Math;
public class q4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Quadratic Equation of the form: ax^2+bx+c");
        System.out.println("Enter the coefficient of x^2: ");
        int a=sc.nextInt();
        System.out.println("Enter the coefficient of x: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c=sc.nextInt();
        int discriminant=((b*b)-4*a*c);
        if (discriminant>0){
           int x1=(-b+discriminant)/2*a;
           int x2=(-b-discriminant)/2*a;
           System.out.println("The roots are real and different "+x1+" "+x2);}
        else if (discriminant==0){
            int x1=-b/2*a;
            System.out.println("The roots are real and equal "+x1+" "+x1);}
        else{
            int real_part=-b/2*a;
            double imaginary_part=Math.sqrt(-discriminant)/2*a;
            System.out.println("The roots are complex and different "+real_part+"+i"+imaginary_part);}                



    }  
}
