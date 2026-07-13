import java.util.*;
public class LC_1295 {
    public int findNumbers(int[] nums) {
        int count_num=0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int count_digits=0;
            while(temp>0){
                count_digits=count_digits+1;
                temp=temp/10;
            }
            if(count_digits%2==0){
                count_num=count_num+1;
            }
        }
        return count_num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n= sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        LC_1295 obj = new LC_1295();
        int count_num=obj.findNumbers(nums);
        System.out.println("Find numbers with even no. of digits: " + count_num);
        sc.close();
    }
}
