public class second_smllest {
        public static int  ram(int []arr)  {
            int min=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            int smin=arr[0];
            for(int i=0;i<n;i++){
                if(smin>arr[i] && arr[i]!=min){
                    smin=arr[i];
                }
            }
            return smin;
        }
        public static void main(String[] args) {
            int[] arr = {2, 77, 66, -89,980, 2, -66, 210, 0};
            int sui = ram(arr);
            System.out.println(sui);

        }
    }


