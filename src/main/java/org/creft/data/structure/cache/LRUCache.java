package org.creft.data.structure.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class LRUCache<T> {

    private final int capacity;
    private final Map<Integer, T> entryMap;
    private final Queue<T> recentlyUsedQueue;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.entryMap = new HashMap<>(capacity);
        this.recentlyUsedQueue = new ArrayDeque<>();
    }

    public void put(T data, int id){
        if(this.entryMap.entrySet().size() >= this.capacity){
            //we need to evict the LRU entry

        }
        else{
            entryMap.put(id, data);
        }
    }

    public T get(int id) throws Exception{
        if(this.entryMap.containsKey(id)){
            //move this entry to the 'front' of the queue

            return this.entryMap.get(id);
        }
        else throw new Exception("Cache miss");
    }
}
