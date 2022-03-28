import java.util.*;
class RandomizedSet {
    HashSet<Integer> hs = new HashSet<>();
       
   public RandomizedSet() {
       
      
       
   }
   
   public boolean insert(int val) {
       if(hs.contains(val))
           return false;
       else
       {
           hs.add(val);
           return true;
       }
       
   }
   
   public boolean remove(int val) {
       if(hs.contains(val))
       {
           hs.remove(val);
           return true;
       }
       else 
           return false;
       
   }
   
   public int getRandom() {
       ArrayList<Integer> al = new ArrayList<>(hs);
       int max = al.size();
       int min = 0;
       int ind = (int)(Math.random() * (max - min) + min);
       return al.get(ind);
   }
}

/**
* Your RandomizedSet object will be instantiated and called as such:
* RandomizedSet obj = new RandomizedSet();
* boolean param_1 = obj.insert(val);
* boolean param_2 = obj.remove(val);
* int param_3 = obj.getRandom();
*/