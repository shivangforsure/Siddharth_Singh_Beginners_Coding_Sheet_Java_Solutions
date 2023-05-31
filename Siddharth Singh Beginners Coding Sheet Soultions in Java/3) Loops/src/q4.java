public class q4 {
    public static void main(String[] args) {
        fib(5);
    }
    static void fib(int n){
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=1; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        
    }
}
