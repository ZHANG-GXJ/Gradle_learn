package leetcode.easy;

public class AddBinary {
    public static String  addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        int sum = 0, carry = 0;
        while (i>=0 || j>=0){
            sum = carry;
            if(i>=0) sum += a.charAt(i--)-'0'; //自右向左计算
            if(j>=0) sum += b.charAt(j--)-'0';

            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0) sb.append(carry);

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        addBinary(a,b);
    }
}
