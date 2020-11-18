package lections.lesson14.fi;

@FunctionalInterface
public interface OneMethodInterface<K1, K2, K3, V> {

    V singleMethod(K1 key1, K2 key2, K3 key3);

}
