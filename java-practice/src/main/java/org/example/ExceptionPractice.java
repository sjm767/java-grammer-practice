package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExceptionPractice {

  public static void main(String[] args) throws InterruptedException {
    Stream<Integer> stream = Stream.of(3, -5, 7, 10, -3);

    List<Integer> result = stream.filter((x) -> x > 0)
        .collect(Collectors.toList());

    System.out.println(result);

  }
}
