import java.util.*;
public class LC_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_streak=0;
        int curr_streak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr_streak=curr_streak+1;
                max_streak=Math.max(max_streak,curr_streak);
            }
            else{
                curr_streak=0;
            }
        }
        return max_streak;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
       }
       LC_485 obj = new LC_485();
       int max_streak=obj.findMaxConsecutiveOnes(nums);
       System.out.println("Max consecutive ones: "+max_streak);
       sc.close();
    }
}
