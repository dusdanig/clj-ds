package com.github.krukow.clj_ds;

import com.github.krukow.clj_lang.Sorted;

import java.util.Map;

public interface PersistentSortedMap<K, V> extends PersistentMap<K, V>, Sorted<K,Map.Entry<K,V>> /* , SortedMap<K, V> */{

	PersistentSortedMap<K, V> zero();

	PersistentSortedMap<K, V> plus(K key, V val);

	PersistentSortedMap<K, V> plusEx(K key, V val);

	PersistentSortedMap<K, V> minus(K key);

}
