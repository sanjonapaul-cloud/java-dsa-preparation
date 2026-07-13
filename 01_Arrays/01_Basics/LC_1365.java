import java.util.*;
public class LC_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count=count+1;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        LC_1365 obj=new LC_1365();
        ans=obj.smallerNumbersThanCurrent(nums);
        System.out.println("The elements in the new array:");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();

    }
}
