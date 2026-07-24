public class Linear {
    public static int[] ram(int []arr) {
        int target=5;
        int n=arr.length;
        int ind=0;
        boolean flag =false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ind=i;
                flag=true;
                break;

            }

        }
        if(flag){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        return new int[]{target,ind};
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5,5,6,7};
        int []miss=ram(arr);
        System.out.println("at index "+miss[1]);
    }
}
