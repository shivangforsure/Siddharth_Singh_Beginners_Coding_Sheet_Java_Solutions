import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        int max=arr[0]; //yeh bhul gya tha\\
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];}
        }
        System.out.println("The largest element of "+Arrays.toString(arr)+" is "+max);
        sc.close();
    }
}
