import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String max=arr[0];
        for(int i=0;i<arr.length;i++){ 
            if(arr[i].length()>max.length()){
                max=arr[i];}            
        }
        System.out.println(max);
        sc.close();
    }
}
