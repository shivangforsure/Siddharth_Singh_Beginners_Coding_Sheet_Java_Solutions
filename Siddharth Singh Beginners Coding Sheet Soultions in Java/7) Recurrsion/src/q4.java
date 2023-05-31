public class q4 {
    public static void main(String[] args){
	    System.out.println(power(2,2));
	}
	public static int power(int  a, int b){
	    if(a==0 && b==0){
	        return -1;
	    }
	    if(b==0){
	        return 1;
	    }
	    if(a==0){
	        return 0;
	    }
	    if(b==1){
	        return a;
	    }
	    else{
	        return a*power(a, b-1);
	    }
	}
}
