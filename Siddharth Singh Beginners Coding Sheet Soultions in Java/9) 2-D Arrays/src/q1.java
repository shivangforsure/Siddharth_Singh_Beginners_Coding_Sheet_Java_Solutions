public class q1 {
    public static void main(String[] args) throws Exception {
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
        arrSum2D(arr1, arr2);
    }
    public static void arrSum2D(int arr1[][], int arr2[][]){
        int n=arr1.length;
        int finArr[][]=new int[n][];
        //this is important.
         for (int i = 0; i < n; i++) {
            finArr[i] = new int[arr1[i].length];
        }
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                finArr[i][j]=(arr1[i][j]+arr2[i][j]);
            }
        }
        for(int i=0; i<finArr.length; i++){
            for(int j=0; j<finArr[i].length; j++){
                System.out.print(finArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}