import java.util.*;
public class LC_977 {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i]*nums[i];
        }
        for(int j=0;j<=n-2;j++){
            int min_index=j;
            for(int k=j;k<=n-1;k++){
                if(ans[k]<ans[min_index]){
                    min_index=k;
                }
            }
            int temp=ans[min_index];
            ans[min_index]=ans[j];
            ans[j]=temp;
        }
        return ans;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of elments in the array:");
      int n=sc.nextInt();
      int[] nums=new int[n];
      int[] ans=new int[n];
      System.out.println("Enter elements in the array:");
      for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
      }
      LC_977 obj=new LC_977();
      ans=obj.sortedSquares(nums);
      System.out.println("Elements in the new array:");
      for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
      }
      sc.close();
    }
    
}
