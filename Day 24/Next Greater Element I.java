class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] next = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[nums1.length];
        for(int i = n-1; i >= 0; i--)
        {
            while(!st.isEmpty() && st.peek() < nums2[i])
            {
                st.pop();
            }
            // ans[i] = ;
            hm.put(nums2[i],(st.isEmpty() ?-1:st.peek()));
            st.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++)
        {
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}