import java.util.*;
public class LC_7 {
    // 1. Added 'static' so it can be called from the main method
    public static int reverse_integer(int num){
        int digit;
        long sum=0;//2. Changed to 'long' to handle potential overflow
       while(num!=0){
        digit=num%10;
        sum=sum*10+digit;
        num=num/10;
       }
       //LeetCode Guardrail: Check for 32-bit signed integer overflow
       if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
         return 0;
       }
       return (int)sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Before reverse = "+num);
        num=reverse_integer(num);
        System.out.println("After reverse = "+num);
        sc.close();
        
    }
}
