class q3{
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];}
        double mean=sum/arr.length;
        double den=0;
        for(int j=0;j<arr.length;j++){
            den+=Math.pow(arr[j]-mean,2);} // it is not running by multiplying
        double x=den/arr.length-1;
        double fin=Math.sqrt(x);
        System.out.printf("%.2f",(float)fin);
    }
}