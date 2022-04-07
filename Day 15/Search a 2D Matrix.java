import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int start = 0;
        int end = m*n - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            int rowNo = mid/n;
            int colNo = mid%n;
            if(matrix[rowNo][colNo] == target)
                return true;
            if(matrix[rowNo][colNo] > target)
                end = mid - 1;
            if(matrix[rowNo][colNo] < target)
                start = mid + 1;
        }
        return false;
        
    }
}