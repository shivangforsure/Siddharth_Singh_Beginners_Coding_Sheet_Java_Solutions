import java.util.Scanner;
public class q3 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3=sc.nextInt();
        System.out.println("Enter the third number: ");
        if(num1>num2 && num1>num2){
            System.out.println(num1+" is greatest!");}
        else if(num2>num1 && num2>num3){
            System.out.println(num2+" is greatest!");}
        else{
            System.out.println(num3+" is greatest!");}       
    }
}
