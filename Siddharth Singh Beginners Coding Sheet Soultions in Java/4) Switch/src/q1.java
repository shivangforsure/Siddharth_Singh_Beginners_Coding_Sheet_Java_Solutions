import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the Operator(+,-,*,/) ");
        char opr=sc.next().charAt(0);
        switch(opr){
            case '+':
                System.out.println("The addition of "+num1+" and "+num2+" is "+num1+num2);
                break;
            case '-':
                System.out.println("The substraction of "+num1+" and "+num2+" is "+(num1-num2));
                break;
            case '*':
                System.out.println("The multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                break;
            case '/':
                System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));
                break;
            default:
                System.out.println("You entered the wrong Operator");    

        }
        sc.close();
    }
}
