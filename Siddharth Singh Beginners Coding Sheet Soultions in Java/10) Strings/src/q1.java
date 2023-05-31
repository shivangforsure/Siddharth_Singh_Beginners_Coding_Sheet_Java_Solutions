import java.util.*;
public class q1 {
    public static void main(String[] args){
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the Character");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            //char c=tr.charAt(i);
            if(str.charAt(i)==(ch)){
                count++;}}
        System.out.println(ch+" appears "+count+" times in "+str);
        sc.close();


    }
}
