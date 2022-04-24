class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < order.length(); i++)
        {
            hm.put(order.charAt(i), i);
        }
        for(int j = 0; j < words.length - 1; j++)
        {
            String word1 = words[j];
            String word2 = words[j+1];
            int minLength = Math.min(word1.length(), word2.length());
            int maxLength = Math.max(word1.length(), word2.length());
            int i = 0;
            String w1 = "";
            String w2 = "";
            while(i < minLength)
            {
                char ch = word1.charAt(i);
                char ch1 = word2.charAt(i);
                w1+=ch;
                w2+=ch1;
                int a = hm.get(ch);
                int b = hm.get(ch1);
                if(a == b)
                    i++;
                else if(a < b)
                    break;
                else
                    return false;
            }
            if(w1.compareTo(w2) == 0 && maxLength != minLength)
            {
                if(word1.length() > word2.length())
                    return false;
            }
        }
        return true;
    }
}