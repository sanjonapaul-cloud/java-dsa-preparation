import java.util.*;

public class LC_66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        
        // Traverse the array from the last digit to the first
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry over needed, we are done!
            }
            
            // If the digit is 9, it becomes 0 and the loop carries over to the next digit
            digits[i] = 0;
        }
        
        // If we reach here, it means all digits were 9 (e.g., 999 -> 1000)
        int[] newDigits = new int[length + 1];
        newDigits[0] = 1; // The rest defaults to 0 in Java
        
        return newDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        // Handle 0 specifically to avoid count being 0
        if (num == 0) {
            int[] zeroArray = {0};
            LC_66 obj = new LC_66();
            zeroArray = obj.plusOne(zeroArray);
            System.out.println("After the update: " + zeroArray[0]);
            return;
        }

        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            count = count + 1;
        }
        
        int[] digits = new int[count];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        
        System.out.println("The array elements are:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        LC_66 obj = new LC_66();
        digits = obj.plusOne(digits);
        
        System.out.println("After the update:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}