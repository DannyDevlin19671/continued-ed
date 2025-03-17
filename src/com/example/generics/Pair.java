package com.example.generics;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 * <p></p>
 * How It Works:
 * </p>
 * <p>
 * The class has two generic types, K (Key) and V (Value).
 * Used to store key-value pairs, similar to Map.Entry<K, V>.
 * </p>
 * <p>
 * Example usage:
 * </p>
 * <p>
 * Pair<String, Integer> agePair = new Pair<>("Alice", 25);
 * System.out.println(agePair.getKey() + " is " + agePair.getValue() + " years old.");
 * </p>
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
