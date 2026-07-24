
class DUPLICATE  {
    public static boolean ram(int[]nums) {

            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,45,3,33,4,-3,3,56};
    boolean flag=ram(arr);
        System.out.println(flag);

    }
    }
    // leetcode pr krega toh TLE show krega logic shi h lakein O(n*2) h toh leetcode accept nhi krega toh wha pr phla sort krne h built-in fnc
// fhir logic
