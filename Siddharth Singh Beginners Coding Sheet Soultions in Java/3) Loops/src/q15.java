import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        String strnum=Integer.toString(num);
        int sum=0;
        double mul=1;
        int numch=0;
        for(int i=0;i<strnum.length();i++){
            char ch=strnum.charAt(i);
            String sch=""+ch;
            numch=Integer.parseInt(sch);
            mul=Math.pow(numch,strnum.length());
            int imul=(int)mul;
            sum+=imul;
            //System.out.println(numch);
        }
        /*for(int j=0;j<strnum.length();j++){
            mul+=strnum.length()*numch;
            sum+=mul;}*/
        if(sum==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    sc.close();
    }
}
