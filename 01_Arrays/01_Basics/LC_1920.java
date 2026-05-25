import java.util.*;
class LC_1920 {
    //Here int[] in method signature means the method will return an integer array.
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {5,0,1,2,3,4};
        //Object creation
        LC_1920 obj = new LC_1920();
        int[] ans;
        //nums is passed as an array argument.
        ans = obj.buildArray(nums);
        //In enhanced for loop , "int num" should always be declared inside the enhanced for loop.
        for(int num : ans){
            System.out.print(" "+ num);
        }

    }
}