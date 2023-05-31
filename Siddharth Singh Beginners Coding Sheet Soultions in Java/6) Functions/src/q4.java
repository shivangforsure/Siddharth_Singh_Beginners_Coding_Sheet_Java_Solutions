public class q4 {
    public static void main(String[] args) {
        System.out.println("The Binary Conversion of the number is: "+decToBin(75));
    }
    public static int decToBin(int n) {
        String str="";
        while(n>0){
            str=n%2+str;
            n/=2; 
        }
        return (int)Integer.parseInt(str);
    }
}
