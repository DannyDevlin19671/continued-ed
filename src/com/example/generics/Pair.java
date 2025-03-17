package com.example.generics;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}
