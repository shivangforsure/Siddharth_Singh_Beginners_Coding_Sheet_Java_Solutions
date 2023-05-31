import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++){
	    char a=str.charAt(i);
	    if(a=='z')
	    a='a';
	    else if(a=='Z')
	    a='A';
	    else if(Character.isLetter(a))
	    a=(char)(a+1);
	   
	    str1=str1+a;
	    }
	    System.out.println(str1);
        
        sc.close();
        
    }
}
