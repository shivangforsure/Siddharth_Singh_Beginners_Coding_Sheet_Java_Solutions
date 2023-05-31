import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine().toLowerCase();
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                str2+=str.charAt(i);}
            
            /*if((str.charAt(i)>=33 && str.charAt(i)<=64)&&(str.charAt(i)>=91 && str.charAt(i)<=96)&&(str.charAt(i)>=123 && str.charAt(i)<=126)){
                str}
                System.out.println(str);*/
            }
        System.out.println(str2);
        sc.close();

    }
}
