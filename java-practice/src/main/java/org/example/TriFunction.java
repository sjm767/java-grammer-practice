package org.example;

@FunctionalInterface
public interface TriFunction<T,U,V,R> {

  R apply(T x,U y,V z);
}
