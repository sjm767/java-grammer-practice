package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.object.order.Order;
import org.example.object.order.Order.OrderStatus;
import org.example.object.order.OrderLine;
import org.example.object.order.OrderLine.OrderLineType;
import org.example.object.order.User;

public class StreamPractice {

  public static void main(String[] args) {
//    User user1 = new User()
//        .setId(101)
//        .setName("Paul")
//        .setVerified(true)
//        .setEmailAddress("alice@fastcampus.co.kr");
//
//    User user2 = new User()
//        .setId(102)
//        .setName("David")
//        .setVerified(false)
//        .setEmailAddress("bob@fastcampus.co.kr");
//
//    User user3 = new User()
//        .setId(103)
//        .setName("John")
//        .setVerified(true)
//        .setEmailAddress("charlie@fastcampus.co.kr");
//
//    List<User> users = Arrays.asList(user1, user2, user3);
//
//    List<Optional<User>> optionalUsers = users.stream()
//        .map((user) -> Optional.ofNullable(user))
//        .filter(user-> user.isPresent())
//        .collect(Collectors.toList());
//
//    List<String> emails = optionalUsers.stream()
//        .filter(user -> user.get().getEmailAddress() != null)
//        .map(user -> user.get().getEmailAddress())
//        .collect(Collectors.toList());
//
//    System.out.println(emails);
//
//    LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
//    Order order1 = new Order()
//        .setId(1001)
//        .setStatus(OrderStatus.CREATED)
//        .setCreatedAt(now.minusHours(4))
//        .setOrderLines(Arrays.asList
//        (
//            new OrderLine()
//            .setId(10001)
//            .setType(OrderLineType.PURCHASE)
//            .setAmount(BigDecimal.valueOf(5000)),
//            new OrderLine()
//            .setId(10002)
//            .setType(OrderLineType.PURCHASE)
//            .setAmount(BigDecimal.valueOf(4000))
//        ))
//        .setCreatedByUserId(101);
//    Order order2 = new Order()
//        .setId(1003)
//        .setStatus(OrderStatus.ERROR)
//        .setCreatedAt(now.minusHours(1))
//        .setOrderLines(Arrays.asList
//        (
//            new OrderLine()
//                .setId(10003)
//                .setType(OrderLineType.PURCHASE)
//                .setAmount(BigDecimal.valueOf(2000)),
//            new OrderLine()
//                .setId(10004)
//                .setType(OrderLineType.DISCOUNT)
//                .setAmount(BigDecimal.valueOf(-1000))
//        ))
//        .setCreatedByUserId(103);
//    Order order3 = new Order()
//        .setId(1002)
//        .setStatus(OrderStatus.PROCESSED)
//        .setCreatedAt(now.minusHours(36))
//        .setOrderLines(Arrays.asList
//        (
//            new OrderLine()
//                .setId(10005)
//                .setType(OrderLineType.PURCHASE)
//                .setAmount(BigDecimal.valueOf(2000))
//
//        ))
//        .setCreatedByUserId(102);
////    Order order4 = new Order()
////        .setId(1004)
////        .setStatus(OrderStatus.ERROR)
////        .setCreatedAt(now.minusHours(15))
////        .setCreatedByUserId(104);
////    Order order5 = new Order()
////        .setId(1005)
////        .setStatus(OrderStatus.IN_PROGRESS)
////        .setCreatedAt(now.minusHours(10))
////        .setCreatedByUserId(101);

  }

  public static User maybeGetUser(boolean returnUser) {
    if (returnUser) {
      return new User()
          .setId(1001)
          .setName("Alice")
          .setEmailAddress("alice@fastcampus.co.kr")
          .setVerified(false);
    }
    return null;
  }
}
