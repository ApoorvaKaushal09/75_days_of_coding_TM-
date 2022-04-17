class LRUCache {
    
    LinkedHashMap<Integer, Integer> lhm;
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        lhm = new LinkedHashMap<Integer, Integer>(){
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        Integer res = lhm.get(key);
        if(res == null){
            return -1;
        }
            
        lhm.remove(key);
        lhm.put(key, res);
        
        return res;
    }
    
    public void put(int key, int value) {
        lhm.remove(key);
        lhm.put(key, value);    
    }
}