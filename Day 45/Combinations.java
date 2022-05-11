class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    public void caller(int n, int k, int curr, ArrayList<Integer> al)
    {
        if(al.size() == k)
        {
            arr.add(new ArrayList<Integer>(al));
            return;
        }
        for(int i = curr; i <= n; i++)
        {
            al.add(i);
            caller(n, k, i+1, al);
            al.remove(al.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        
        caller(n, k, 1, new ArrayList<Integer>());
        return arr;
    }
}