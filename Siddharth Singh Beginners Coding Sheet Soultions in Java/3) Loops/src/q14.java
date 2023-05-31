import java.util.*;
public class q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int n2=sc.nextInt();
        System.out.println("Prime Numbers are: ");
        sc.close();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        int count=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            return false;
        }
        else{
            return true;
        }
    }
}
