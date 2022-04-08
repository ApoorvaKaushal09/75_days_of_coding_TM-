import java.util.*;
class Solution {
     public int firstMissingPositive(int[] nums) {
        int min = 1;
        boolean flag = true;
		
        while (flag == true) {
            flag = false;
            for (int num : nums) {
                if (min == num) {
                    min++;
                    flag= true;
                }
            }
        }

        return min;
    }
}