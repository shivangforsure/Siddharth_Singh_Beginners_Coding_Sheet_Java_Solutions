import java.util.Scanner;
public class q13 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num>1){
            for(int i=2;i<num;i++){
                if (num%i==0){
                    System.out.println("The number is not Prime");
                    break;}
                else{
                        System.out.println("The number is Prime");}}
                
            }
        else{
            System.out.println("The number is not Prime");}    
            sc.close();
    }
}
