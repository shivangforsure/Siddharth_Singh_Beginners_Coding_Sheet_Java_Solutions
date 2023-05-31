public class q3 {
    public static void main(String[] args) {
        System.out.println(gcd(-5, 8));
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else if(a<0||b<0){
            return gcd(-1*a, -1*b);
        }
        else{
            return gcd(b, a%b);
        }
    }
}
