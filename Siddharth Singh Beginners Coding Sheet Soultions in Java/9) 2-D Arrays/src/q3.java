public class q3 {
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        arrTranspose(arr);
    }
    public static void arrTranspose(int arr[][]){
        int finArr[][]=new int[arr.length][];
        for (int i = 0; i < finArr.length; i++) {
            finArr[i]=new int [arr[i].length];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                finArr[i][j]=arr[j][i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(finArr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
