class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> incrSubseq = new ArrayList<>();
        incrSubseq.add(nums[0]);
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] > incrSubseq.get(incrSubseq.size() - 1))
                incrSubseq.add(nums[i]);
            else{
                int idx = getNextGreaterElement(incrSubseq, nums[i]);
                incrSubseq.set(idx, nums[i]);
            }
        }        
        return incrSubseq.size();        
    }

    // Return the index of the smallest element that is greater than or equal to the given number
    int getNextGreaterElement(List<Integer> list, int num){        
        int left = 0, right = list.size() - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(num == list.get(mid))
                return mid; // When same number already present we return the index of that element
            if(num > list.get(mid))
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}