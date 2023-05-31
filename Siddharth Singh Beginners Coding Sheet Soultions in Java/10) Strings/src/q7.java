import java.util.Scanner;
public class q7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.next();
        String restr="";
        for(int i=str.length()-1;i>=0;i--){
            restr=restr+str.charAt(i);}
        if(str.equalsIgnoreCase(restr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}


