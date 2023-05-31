public class q2 {
    public static void main(String[] args) {
        int arr1[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int arr2[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        arrMul(arr1, arr2);
    }
    public static void arrMul(int arr1[][], int arr2[][]){
        int a=arr1.length;
        int b=arr1[0].length;

        int c=arr2.length;
        int d=arr2[0].length;

        int finArr[][]=new int[arr1.length][];
        for (int i = 0; i < finArr.length; i++) {
            finArr[i]=new int[arr1[i].length];
        }
        if(b!=c){
            System.out.println("Can't multiply");
        }
        else{
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    for (int k = 0; k < d; k++) {
                        finArr[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < finArr.length; i++) {
            for (int j = 0; j < finArr[i].length; j++) {
                System.out.print(finArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
