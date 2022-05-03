class Solution
{
    //Function to merge k sorted arrays.
    static class Pair
    {
        int val; 
        int ind1;
        int ind2;
        Pair(int a, int b, int c)
        {
            val = a;
            ind1 = b;
            ind2 = c;
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(int i = 0 ; i < K; i++)
        {
            pq.offer(new Pair(arr[i][0], i, 0));
        }
        ArrayList<Integer> ar = new ArrayList<>();
        while(!pq.isEmpty())
        {
            Pair p = pq.poll();
            ar.add(p.val);
            if(p.ind2 + 1 <= K-1)
            {
                pq.offer(new Pair(arr[p.ind1][p.ind2+1], p.ind1, p.ind2+1));
            }
        }
        return ar;
        
    }
}