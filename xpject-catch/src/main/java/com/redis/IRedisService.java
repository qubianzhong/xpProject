package com.redis;

public interface IRedisService<K, V> {
	
	public void set(K key, V value, long expiredTime);  
    public V get(K key);
    public Object getHash(K key, String name);
    public void del(K key);
}
