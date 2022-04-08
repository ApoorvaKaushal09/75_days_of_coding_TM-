import java.util.*;
class RandomizedCollection {
    
    Random r;
    HashMap<Integer , HashSet<Integer>> hm;
    ArrayList<Integer> arr;

    public RandomizedCollection() {
        arr= new ArrayList<>();
        hm= new HashMap<>();
        r= new Random();
    }
    
    public boolean insert(int val) {
        arr.add(val);
        if(hm.containsKey(val)){
            
            HashSet<Integer> hs = hm.get(val);
            hs.add(arr.size()-1);
            
            return false;
        }else{
            HashSet<Integer> hs = new HashSet<>();
            hs.add(arr.size()-1);
            hm.put(val , hs);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val)){
            
            int vidx = hm.get(val).iterator().next(); 
            int lidx = arr.size()-1;
            int lval = arr.get(lidx);
            
            arr.set(lidx , val);
            arr.set(vidx, lval);
            
            arr.remove(lidx);
            hm.get(val).remove(vidx);
            
            if(hm.get(val).size()==0){
                hm.remove(val);
            }
            
            if(hm.containsKey(lval)){
                hm.get(lval).remove(lidx);
                hm.get(lval).add(vidx);
            }
            
            return true;
        }else{
            
            
            return false;
        }
    }
    
    public int getRandom() {
        int idx= r.nextInt(arr.size());
        return arr.get(idx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */