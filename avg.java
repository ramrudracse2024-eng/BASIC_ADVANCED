class avg {
    public static float  ram(int []arr)  {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float avg=( float)sum/n;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {2, 77,5,33,56,1,-1};
        float sui = ram(arr);
        System.out.println(sui);

    }
}
