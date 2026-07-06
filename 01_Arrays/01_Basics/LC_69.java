import java.util.*;
public class LC_69 {
    public int addDigits(int num) {
        int digit;
        int sum=0;
        if(num<=9){
            return num;
        }
        else{
            while(num>9){
              sum=0;
              while(num!=0){
                digit=num%10;
                sum=sum+digit;
                num=num/10;
              }
              num=sum;
            }
            
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        LC_69 obj=new LC_69();
        num=obj.addDigits(num);
        System.out.println("After adding digits = "+num);
        sc.close();

    }
    
}
