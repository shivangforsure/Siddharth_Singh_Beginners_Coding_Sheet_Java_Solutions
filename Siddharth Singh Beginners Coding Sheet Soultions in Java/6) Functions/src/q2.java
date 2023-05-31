public class q2 {
    public static void main(String[] args) {
        int number=34;
        for (int i = 2; i <= number/2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0||n==1||n==0){
                return false;
            }
        }
        return true;
    }
}
