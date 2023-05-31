import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str=sc.nextLine().toLowerCase();
        int vow=0,con=0,dig=0,ws=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
                vow++;}
            if(str.charAt(i)>=49 && str.charAt(i)<=57){
                dig++;}
            if(str.charAt(i)==32){
                ws++;}
                if((str.charAt(i)>=66 && str.charAt(i)<=68)&& (str.charAt(i)>=70 && str.charAt(i)<=72)&& (str.charAt(i)>=74 && str.charAt(i)<=78)&&(str.charAt(i)>=88 && str.charAt(i)<=84) && (str.charAt(i)>=86 && str.charAt(i)<=90)){
                    con++;}
        }
        System.out.println(vow+" "+con+" "+dig+" "+ws);
        sc.close();

     }    
}
