import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        String strnum=Integer.toString(num);
        String revstrnum="";
        //String strnum=Integer.toString(num);
        for(int i=strnum.length()-1;i>=0;i--){
            revstrnum+=strnum.charAt(i);}
        if(strnum.equals(revstrnum)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
        

    }
}
