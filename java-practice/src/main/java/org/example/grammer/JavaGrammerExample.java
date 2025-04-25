package org.example.grammer;

import java.math.BigDecimal;

public class JavaGrammerExample {

  public record Person(Boolean isActive) {}

  public static void main(String[] args) {
    String json = "{\"isActive\": true}"; // null이 들어가는 경우

  }

  public static boolean resultMethod(String s){
    if (!isCartVisibleTemplate(s)) {
      return false;
    }

    return true;
  }

  public static boolean isCartVisibleTemplate(String s) {

    switch (s){
      case "A":
        return true;
      case "B":
        return false;
    }

    return false;
  }

}
