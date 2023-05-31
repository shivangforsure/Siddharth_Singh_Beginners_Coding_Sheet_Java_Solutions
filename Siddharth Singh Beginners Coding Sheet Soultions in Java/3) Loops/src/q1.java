import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        System.out.println("Enter the number till which you want to get sum: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;}
        System.out.println("The sum of first "+n+" natural numbers is "+sum);    
    sc.close();
    }
}
