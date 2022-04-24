class Twitter {

HashSet[] followers;
LinkedList<int[]> feed; 

public Twitter() {
    followers = new HashSet[501];
    feed = new LinkedList<>();
    
    for(int i = 1 ; i < 501 ; i++)
        followers[i] = new HashSet<>();
    
}

public void postTweet(int userId, int tweetId) {
    feed.addFirst(new int[]{userId , tweetId}); 
}

public List<Integer> getNewsFeed(int userId) {
    Iterator<int[]> it = feed.iterator();
    int count = 0;
    List<Integer> res = new ArrayList<>();
    
    while(it.hasNext() && count < 10){
        int[] f = it.next();
        if(f[0] == userId || followers[userId].contains(f[0])){ 
            res.add(f[1]);
            count++;
        }
    }
    
    return res;
}

public void follow(int followerId, int followeeId) {
    followers[followerId].add(followeeId);
}

public void unfollow(int followerId, int followeeId) {
    followers[followerId].remove(followeeId);
}
}