package org.example.grammer;

public class JavaGrammerExample {

  public static void main(String[] args) {
    String s = "B";
    boolean result = resultMethod(s);

    System.out.println(result);

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
