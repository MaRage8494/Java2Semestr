package prakt3;
//Set с использованием ключевого слова synchronized,
//Map с использованием Lock

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception{
        syncSet<Integer> set = new syncSet<>();
        Thread one = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                set.add(i);
            }
        }
        );

        lockMap<Integer,Integer> map = new lockMap<>();
        Thread two = new Thread(()->{
           for (int i = 0; i < 10; i++){
               map.put(i,i+10);
           }
        });

        one.start();
        two.start();
        Thread.sleep(1500);
        Thread.sleep(3000);
        for(int value:set){
            System.out.print(value + ", ");
        }
        System.out.println();
        for(var value:map.entrySet()){
            System.out.println(value.getKey() + " " + value.getValue() + " ");
        }


    }
}
class syncSet<E> implements Set<E>{
    private HashSet<E> set = new HashSet<>();

    @Override
    public synchronized int size() {
        return set.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public synchronized Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return new Object[0];
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public synchronized boolean add(E e) {
        return set.add(e);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends E> c) {
        return set.addAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public synchronized void clear() {
        set.clear();
    }
}

//////////////////////////////////////
//////////////////////////////////////
//////////////////////////////////////
//////////////////////////////////////
//////////////////////////////////////
//////////////////////////////////////

class lockMap<K,V> implements Map<K,V>{
    private static final Lock lock = new ReentrantLock();
    private HashMap<K,V> map = new HashMap<>();
    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        map.put(key,value);
        lock.unlock();
        return null;
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        map.remove(key);
        lock.unlock();
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        lock.lock();
        map.entrySet();
        lock.unlock();
        return map.entrySet();
    }
}