class reverse {
    public static int  []ram(int []arr)  {
        int n=arr.length;
       int i=0,j=n-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 77, 66, -89, 80, 2, -66, 210, 0};
        int sui[] = ram(arr);
        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
