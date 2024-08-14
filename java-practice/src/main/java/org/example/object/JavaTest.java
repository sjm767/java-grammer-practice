package org.example.object;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaTest {

  public static void main(String[] args) {

    Stack<BooleanSupplier> stack = new Stack<>();

    Predicate<Integer> isEven = (num) -> {
      System.out.println("function executed num is "+ num);
      return num % 2 == 0;
    };

//    String exp = "1 3 5 AND AND";
    String exp = "2 1 3 AND OR";
    String[] splitedExpression = exp.split(" ");

    Arrays.stream(splitedExpression)
        .forEach((expression)->{
          if(expression.matches("-?\\d+")){
            Integer num = Integer.parseInt(expression);
            stack.push(()->isEven.test(num));
          }else{
            BooleanSupplier fun1 = stack.pop();
            BooleanSupplier fun2 = stack.pop();
            if (expression.equals("OR")) {
              stack.push(()-> fun1.getAsBoolean() || fun2.getAsBoolean());
            } else if (expression.equals("AND")) {
              stack.push(() -> fun1.getAsBoolean() && fun2.getAsBoolean());
             }
          }
        });

    if (!stack.isEmpty()) {
      BooleanSupplier supplier = stack.pop();
      boolean result = supplier.getAsBoolean();
      System.out.println(result);
    }
  }

  public static boolean getTrue(int num){
    System.out.println("TRUE: "+num);
    return true;
  }
  public static boolean getFalse(int num){
    System.out.println("FALSE: "+num);
    return false;
  }

  public static boolean test(Predicate<String> filter, String str){
    return filter.test(str);
  }

}
