class Solution {
    List<String> al = new ArrayList<>();
    public void caller(int n, int open, int close, String s)
    {
        if(s.length() == n*2)
        {
            al.add(s);
            return;
        }
        if(open < n)
            caller(n, open+1, close, s+"(");
            // s = s.ubstring(0, s.length());
        if(close < open)
            caller(n, open, close+1, s+")");
        
    }
    public List<String> generateParenthesis(int n) {
        caller(n, 0, 0, "");
        return al;
        
    }
}

