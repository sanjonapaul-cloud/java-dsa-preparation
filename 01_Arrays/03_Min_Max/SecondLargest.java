public class SecondLargest {
    public int second_largest_num(int[] nums){
        Integer firstMax=Integer.MIN_VALUE;
        Integer secondMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(firstMax==nums[i]||secondMax==nums[i]){
                continue;
            }
            if(nums[i]>firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        return secondMax;

    }
    public static void main(String[] args){
        int[] nums={1,4,3,5,2,6,9,6,10};
        SecondLargest obj=new SecondLargest();
        int num=obj.second_largest_num(nums);
        System.out.println(num);
    }
}
