class smallest {
    public static int  []ram(int []arr)  {
        int n=arr.length;
        int min=arr[0];
        int minInd=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                minInd=i;
            }
        }
        return new int []{min,minInd};
    }
    public static void main(String[] args) {
        int[] arr = {2, 77, 66, -89, 80, 2, -66, 210, 0};
        int sui[] = ram(arr);
        System.out.println(sui[0]);
        System.out.println("at Index "+sui[1]);
    }
}
