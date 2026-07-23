class largest {
    public static int  []ram(int []arr)  {
        int n=arr.length;
        int max=arr[0];
        int IndexMax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                IndexMax=i;
            }
        }
        return new int []{max,IndexMax};
    }
    public static void main(String[] args) {
        int [] arr={2,77,66,2,80,2,-66,2,0};
        int sui []=ram(arr);
        System.out.println(sui[0]);
        System.out.println("at Index "+sui[1]);
    }
}