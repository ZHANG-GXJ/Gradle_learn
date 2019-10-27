package leetcode.easy;

public class Sqrt {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        if(x == 0) return  0;
        int left = 1, right = x;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(mid == x/mid){
                return  mid;
            }else if(mid > x/mid){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return right;  //为何返回right
        //最后一次循环是 left = right = mid；如 传入8时，都为3，而right刚好为mid-1,即为2.


    }
}
