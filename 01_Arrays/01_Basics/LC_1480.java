class LC_1480 {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum=nums[0];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        LC_1480 obj = new LC_1480();
        int[] ans;
        ans=obj.runningSum(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+ans[i]);
        }

    }
}
