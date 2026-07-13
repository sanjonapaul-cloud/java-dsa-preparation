import java.util.*;
public class LC_1929 {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        LC_1929 obj = new LC_1929();
        int[] ans = new int[2*n];
        ans=obj.getConcatenation(nums);
        System.out.println("The new array is:");
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
