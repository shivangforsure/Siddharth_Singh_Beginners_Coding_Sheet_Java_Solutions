import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sent=sc.nextLine();
        String arr[]=sent.split(" ");
        //String max;
        for(int i=0;i<arr.length;i++){
            char fch=arr[i].charAt(0);
            char capfch=Character.toUpperCase(fch);
            int l=arr[i].length();
            System.out.print(capfch+arr[i].substring(1,l)+" ");}
        sc.close();
    }   
}
