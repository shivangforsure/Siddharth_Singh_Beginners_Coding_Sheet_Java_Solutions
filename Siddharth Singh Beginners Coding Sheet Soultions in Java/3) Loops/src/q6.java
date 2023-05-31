import java.util.Scanner;
public class q6 {
    public static int gcd(int a, int b){
        if(b==0){
            return a;}
        else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int m=sc.nextInt();
        System.out.println("Enter 2nd No.");
        int n=sc.nextInt();
        System.out.printf("GCD of %d and %d is %d",m, n,gcd(m,n));
        sc.close();


    }
}
