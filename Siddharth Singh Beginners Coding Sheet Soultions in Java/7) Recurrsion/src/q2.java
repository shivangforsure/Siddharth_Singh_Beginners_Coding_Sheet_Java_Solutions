public class q2 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
