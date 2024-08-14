package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamForEachPractice {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c");

    Map<String, String> map = new HashMap<>();

    list.forEach(putMap(map));

    for (String key : map.keySet()) {
      System.out.println("value: " + map.get(key));
    }
  }

  private static Consumer<String> putMap(Map<String,String> map){
    return s -> map.put(s, s);
  }
}
