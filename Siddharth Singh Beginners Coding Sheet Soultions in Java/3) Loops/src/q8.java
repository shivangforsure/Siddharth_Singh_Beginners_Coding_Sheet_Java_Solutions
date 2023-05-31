import java.util.Scanner;

//import javax.xml.transform.Source;
public class q8 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.next();
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);}
        if(revstr.equalsIgnoreCase(str)){
            System.out.println("Reversed");
        }
        else{
            System.out.println("Not Reversed");
        }





    sc.close();
    }
    
}
