class Solution {
    public boolean call(Stack<Character> st, Character ch)
    {
        if(st.isEmpty())
            return false;
        char c1=st.pop();
        if((c1=='(' && ch == ')') || (c1=='{' && ch == '}') || (c1=='[' && ch == ']') )
            return true; 
        return false;
    }
    public boolean isValid(String s) {
        boolean ans=true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else
            {
                if(call(st, ch )==false)
                    ans=false;
            }
        }
        if(ans==false || !st.isEmpty())
            return false;
        return true;
    }
}