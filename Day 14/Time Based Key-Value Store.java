import java.util.*;
class TimeMap {
    HashMap<String,TreeMap<Integer, String>> hm;
    public TimeMap() {
        hm = new HashMap<String,TreeMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        TreeMap<Integer, String> tm =  tm = hm.get(key);
        if(tm == null)
            tm = new TreeMap<>();
        tm.put(timestamp, value);
        hm.put(key, tm);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tm =  hm.get(key);
        if(tm == null)
            return "";
        Map.Entry<Integer, String> ans = tm.floorEntry(timestamp);
        if(ans == null)
            return "";
        return ans.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */