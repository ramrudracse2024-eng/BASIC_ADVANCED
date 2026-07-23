class count_even_odd {
    public static int []  ram(int []arr)  {
        int odd=0;
        int eve=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                eve++;
            }
            else odd++;
        }
        return new int[]{odd,eve};
    }
    public static void main(String[] args) {
        int[] arr = {2, 3,5,4,9,-8,0};
        int  sui []= ram(arr);
        System.out.println("number of odd digits " +sui[0]);
        System.out.println("number of even digits " +sui[1]);
    }
}
