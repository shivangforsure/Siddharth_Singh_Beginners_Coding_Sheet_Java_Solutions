import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sent=sc.nextLine();
        String arr[]=sent.split(" ");
        System.out.println("Number of Words -> "+arr.length);
        sc.close();
    }   
}
