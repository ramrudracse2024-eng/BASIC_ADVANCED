
class second_largesr {
    public static int  ram(int []arr)  {
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=arr[0];
        for(int i=0;i<n;i++){
            if(smax<arr[i] && arr[i]!=max){
                smax=arr[i];
            }
        }
return smax;
    }
    public static void main(String[] args) {
        int[] arr = {2, 77, 66, -89,980, 2, -66, 210, 0};
        int sui = ram(arr);
        System.out.println(sui);

    }
}
