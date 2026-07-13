import java.util.*;
public class LC_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int temp=n;
        for(int i=0;i<n;i++){
            ans[i*2]=nums[i];
            ans[(i*2)+1]=nums[temp];
            temp=temp+1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int doub_n = sc.nextInt();
        int[] nums = new int[doub_n];
        System.out.println("Enter elements in array");
        for(int i=0;i<doub_n;i++){
            nums[i]=sc.nextInt();
        }
        int[] ans=new int[doub_n];
        int n=doub_n/2;
        LC_1470 obj = new LC_1470();
        ans= obj.shuffle(nums,n);
        System.out.println("New elemnts in the array:");
        for(int i=0;i<doub_n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();

    }
}
