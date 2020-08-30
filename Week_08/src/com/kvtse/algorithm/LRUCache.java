package com.kvtse.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 实现一个LRU Cache
 * https://leetcode-cn.com/problems/lru-cache/#/
 *
 * @author Tsing Tse
 * @date 2020-08-30 10:46
 */
public class LRUCache extends LinkedHashMap<Integer,Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        // 如果accessOrder为true,新访问的元素会移动到链表的最后
        return getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        // 在putVal之后,做插入元素的后续处理,afterNodeInsertion,如果此方法返回true
        // 在LinkedHashMap中会删除链表的first元素
        return size() > capacity;
    }
}
