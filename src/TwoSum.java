import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {-3,2,3,4};
        int target = 0;

        int[] Ans = twoSum(nums, target);
        System.out.println(Ans[0]+" "+Ans[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        ArrayList<Integer> set = new ArrayList<>();
        int cons ;
        for(int i=0;i<nums.length;i++){
            cons = target-nums[i];

            if(set.contains(cons)){
                ans[0] = set.indexOf(cons);
                ans[1] = i;
                return ans;
            }
            else{
                set.add(nums[i]);
            }


        }
        return ans;
    }

}
