package homework_solution.lesson7.task2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThreeHashMap<K, V1, V2> {
    private Map<K, V1> map1;
    private Map<K, V2> map2;

    public ThreeHashMap() {
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();
    }

    public int size() {
        return map1.size();
    }

    public boolean isEmpty() {
        return map1.isEmpty();
    }

    public boolean containsKey(K key) {
        return map1.containsKey(key);
    }

    public boolean containsValue1(V1 value) {
        return map1.containsValue(value);
    }

    public boolean containsValue2(V2 value) {
        return map2.containsValue(value);
    }

    public V1 getFirst(K key) {
        return map1.get(key);
    }

    public V2 getSecond(K key) {
        return map2.get(key);
    }

    public void put(K key, V1 value1, V2 value2) {
        map1.put(key, value1);
        map2.put(key, value2);
    }

    public void remove(K key) {
        map1.remove(key);
        map2.remove(key);
    }

    public void putAll(Map<K, V1> m1, Map<K, V2> m2) {
        map1.putAll(m1);
        for (K key : map1.keySet())
            if (!map2.containsKey(key))
                map2.put(key, null);
        map2.putAll(m2);
        for (K key : map2.keySet())
            if (!map1.containsKey(key))
                map1.put(key, null);
    }

    public void clear() {
        map1.clear();
        map2.clear();
    }

    public Set keySet() {
        return map1.keySet();
    }

    public Collection values1() {
        return map1.values();
    }

    public Collection values2() {
        return map2.values();
    }

}
