public class q1 {
    public static void main(String[] args) throws Exception {
        System.out.println(natSum(5));
    }
    static int natSum(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n+natSum(n-1);
        }
    }
}
