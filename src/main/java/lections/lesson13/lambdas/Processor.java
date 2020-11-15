package lections.lesson13.lambdas;

@FunctionalInterface
public interface Processor<V, K1, K2> {

    V process(K1 key1, K2 key2);

}
