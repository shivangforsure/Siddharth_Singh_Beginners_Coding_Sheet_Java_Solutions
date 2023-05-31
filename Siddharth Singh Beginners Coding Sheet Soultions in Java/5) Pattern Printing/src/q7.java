public class q7 {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        int j=0;
        int k=0;
        for (i = 1; i <= n; i++)  
        { 
            
            for (j = i; j < n; j++)  
                System.out.print(" "); 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
                ; 
            } 
            k = 0; 
            System.out.println();  
        } 
        // print last row 
        for (i = 0; i < 2 * n - 1; i++)  
            System.out.print("*"); 
    }
}

