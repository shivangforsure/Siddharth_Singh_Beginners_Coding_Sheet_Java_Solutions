public class q3{
    public static void main(String[] args) {
        System.out.println("The decimal number conversion is: "+binToDec(10101));
    }
    public static int binToDec(int n) {
        int count=0;
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            // System.out.println(x);
            sum+=lastDigit*Math.pow(2, count);
            n/=10;
            count++;
        }
        return sum;
    }
}