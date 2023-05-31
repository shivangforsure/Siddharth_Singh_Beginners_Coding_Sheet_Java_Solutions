import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        System.out.println("Enter 1st Number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int n2=sc.nextInt();
        System.out.println("The Prime Numbers between "+n1+" & "+n2+" are ");
        primeNos(n1, n2);
        sc.close();
    }
    public static void primeNos(int n1, int n2){
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
