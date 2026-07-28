import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class remove_duplictes{
    public static int []ram(int[]a) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
                if ( !ans.contains(a[i])) {
                    ans.add(a[i]);
                }
            }
            int array[] = new int[ans.size()];
            for (int x = 0; x < ans.size(); x++) {
                array[x] = ans.get(x);
            }
            return array;
        }




    public static void main(String[] args) {
        int a[]={4,3,4,2,2,1,8};
        int res[]=ram(a);
        for(int ele:res){
            System.out.println(ele);
        }
    }
}


