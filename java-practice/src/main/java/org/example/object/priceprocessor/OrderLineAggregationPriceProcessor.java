package org.example.object.priceprocessor;

import java.math.BigDecimal;
import java.util.function.Function;
import org.example.object.order.Order;
import org.example.object.order.OrderLine;

public class OrderLineAggregationPriceProcessor implements Function<Order, Order> {

  @Override
  public Order apply(Order order) {
    return order.setAmount(order.getOrderLines().stream()
        .map(OrderLine::getAmount)
        .reduce(BigDecimal.ZERO, BigDecimal::add));
  }
}
