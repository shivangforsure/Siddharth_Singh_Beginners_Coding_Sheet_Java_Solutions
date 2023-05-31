//Bad Method:
/*import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String chs=Character.toString(ch);
            int x=Integer.parseInt(chs);
            sum+=x;}
        System.out.println("The Sum of the digits is "+sum);
    sc.close();

    }
}*/
//Better Method:
import java.util.*;
public class q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        long num=sc.nextInt();
        long num2=num;
        long last_digit=0;
        long rev=0;
        while(num!=0){
            last_digit=num%10;
            //System.out.print(last_digit);
            //System.out.println();
            rev=rev*10+last_digit;
            num=num/10;}
            System.out.println("Reversed Number: "+rev);
            if(num2==rev){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        sc.close();
    }
}