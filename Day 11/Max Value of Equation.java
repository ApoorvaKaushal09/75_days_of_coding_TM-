import java.util.*;
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Pair<Integer, Integer>> dq = new ArrayDeque<>();
		int res = Integer.MIN_VALUE;
        for (int[] p : points) {
            int first = p[0];
            int second = p[1];
			while (!dq.isEmpty() && first - dq.peekFirst().getValue() > k)
                dq.pollFirst();
            int ans = first + second;
			if (!dq.isEmpty())
                res = Math.max(res, dq.peekFirst().getKey() + ans);
            int diff = second - first;
			while (!dq.isEmpty() &&  diff > dq.peekLast().getKey())
                dq.pollLast();
            dq.offerLast(new Pair<>(diff, first));
        }
		return res;
    }
}