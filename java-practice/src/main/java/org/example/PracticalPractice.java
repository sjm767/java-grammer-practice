package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.object.order.Order;
import org.example.object.order.Order.OrderStatus;
import org.example.object.order.OrderLine;
import org.example.object.priceprocessor.OrderLineAggregationPriceProcessor;
import org.example.object.priceprocessor.TaxPriceProcessor;
import org.w3c.dom.ls.LSOutput;

public class PracticalPractice {
  public static void main(String[] args) {
    Function<Integer,Integer> multiplier = i -> i * 2;
    Function<Integer,Integer> addTen = i -> i + 10;

    Order order1 = new Order()
        .setId(1001L)
        .setOrderLines(Arrays.asList(
            new OrderLine().setAmount(BigDecimal.valueOf(1000)),
            new OrderLine().setAmount(BigDecimal.valueOf(2000))));

    List<Function<Order, Order>> priceProcessors = getPriceProcessor(order1);

    Function<Order, Order> reduce = priceProcessors.stream()
        .reduce(Function.identity(), Function::andThen);

    Order apply = reduce.apply(order1);

    System.out.println(apply.getAmount());


  }

  public static List<Function<Order,Order>> getPriceProcessor(Order order){
    return Arrays.asList(
        new OrderLineAggregationPriceProcessor(),
        new TaxPriceProcessor(new BigDecimal("9.375")));
  }

  public static Supplier<String> getStringSupplier(){
    String hello = "Hello";

    return () -> {
      String world = " World";
      return hello + world;
    };
  }

  public static boolean returnTrue(){
    System.out.println("Returning True");
    return true;
  }
  public static boolean returnFalse(){
    System.out.println("Returning False");
    return false;
  }

  public static boolean or(boolean x, boolean y) {
    return x || y;
  }

  public static boolean lazyOr(Supplier<Boolean> x, Supplier<Boolean> y) {
    return x.get() || y.get();
  }
}
