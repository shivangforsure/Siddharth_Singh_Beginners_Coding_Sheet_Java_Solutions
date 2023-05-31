import java.util.*;
public class q1 {
    public static float arrSum(float arr[]){
        float sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=j;}
        return sum;}
    public static void main(String[] args){
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        if(n<=100){
            for(int i=0;i<n;i++){
                arr[i]=sc.nextFloat();}}
        System.out.println("The Array is "+Arrays.toString(arr));
        System.out.println("The sum of Array is "+arrSum(arr));
        sc.close();


    }
}
