class arry_sorted_or_not {
    public static int  []ram(int []arr)  {
        int n=arr.length;
        int swap=0;
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    flag= false;
                    swap++;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("sorted array");
        }
        else{
            System.out.println("not sorted");
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 77, 66, -89, 80, 2, -66, 210, 0};
        int sui[] = ram(arr);

    }
}
