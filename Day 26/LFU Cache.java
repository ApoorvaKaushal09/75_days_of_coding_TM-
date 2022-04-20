class Node{
    int key, value, frequency;
    Node next, prev;
    
    public Node(){
        
    }
    
    public Node(int key, int value, int frequency){
        this.key = key;
        this.value = value;
        this.frequency = frequency;
    }
    
    public int getKey(){
        return this.key;
    }
    
    public int getFrequency(){
        return this.frequency;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public void setFrequency(int frequency){
        this.frequency = frequency;
    }
}

class DLLNode{
    Node head, tail;
    int length;
    
    public DLLNode(){
        this.head = new Node();
        this.tail = new Node();
        this.length = 0;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public void deleteNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        this.length--;
    }
    
    public Node removeLast(){
        Node node = this.tail.prev;
        if(node != head){
            deleteNode(node);
            return node;
        }
        return null;
    }
    
    public void addNode(Node node){
        node.prev = this.head.next.prev;
        node.next = this.head.next;
        this.head.next.prev = node;
        this.head.next = node;
        
        this.length++;
    }
}

class LFUCache {
    int capacity, size, minFreq;
    Map<Integer, Node> cache; // Maps key to Node of element
    Map<Integer, DLLNode> freqMap; // Maps a frequency to doubly linked list

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.minFreq = 1;
        
        this.cache = new HashMap();
        this.freqMap = new HashMap();
    }
    
    public int get(int key) {
        Node node = this.cache.get(key);
        if(node == null){
            return -1;
        }
        updateFrequencyPerPolicy(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = this.cache.get(key);
        
        if(node != null){
            node.setValue(value);
            updateFrequencyPerPolicy(node);
        } else {
            Node newNode = new Node(key, value, 0);
            updateFrequencyPerPolicy(newNode);
            this.cache.put(key, newNode);
            this.size++;
            
            if(this.size > this.capacity){
                DLLNode freqDLL = this.freqMap.get(this.minFreq);
                Node lastNode = freqDLL.removeLast();
                if(lastNode != null){
                    this.cache.remove(lastNode.getKey());
                }
                this.size--;
            }
            
            this.minFreq = 1;
        }
    }
    
    private void updateFrequencyPerPolicy(Node node){
        int oldFreq = node.getFrequency();
        if(this.freqMap.containsKey(oldFreq)){
            DLLNode oldFreqDLL = this.freqMap.get(oldFreq);
            oldFreqDLL.deleteNode(node);
            if(this.minFreq == oldFreq && oldFreqDLL.length == 0){
                this.minFreq++;
            }
        }
        int newFreq = oldFreq + 1;
        node.setFrequency(newFreq);     
        DLLNode newFreqDLL = this.freqMap.getOrDefault(newFreq, new DLLNode());
        newFreqDLL.addNode(node);
        this.freqMap.put(newFreq, newFreqDLL);
    }
}