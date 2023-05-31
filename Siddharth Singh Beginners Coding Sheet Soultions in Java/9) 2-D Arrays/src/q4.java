public class q4 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        System.out.println("Before:");
        System.out.println("A: "+a+"; B: "+b+"; C: "+c);
        cyclicSwap(a, b, c);
    }
    public static void cyclicSwap(int a, int b, int c){
        int temp;
        temp=c;
        c=b;
        b=a;
        a=temp;
        System.out.println("After:");
        System.out.println("A: "+a+"; B: "+b+"; C: "+c);
    }
}
