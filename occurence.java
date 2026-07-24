public class occurence {
    public static int ram(int arr[]) {
        int target=4;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==4){
                count++;
            }
        }
    return count;
}

public static void main(String[] args) {
    int arr[]={4,1,5,2,3,6,7,4,6,4,4,5,6,5,4,2};
    int occ=ram(arr);
    System.out.println(occ);
    }
}
