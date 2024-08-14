package org.example;

import java.awt.image.ImageProducer;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.example.object.order.Order;
import org.example.object.order.Order.OrderStatus;
import org.example.object.order.OrderLine;
import org.example.object.order.User;
import org.example.service.EmailService;

public class StreamAdvancedPractice {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    EmailService emailService = new EmailService();

    User user1 = new User()
        .setId(1001)
        .setName("Alice")
        .setEmailAddress("alice@gmarket.com")
        .setCreatedAt(now.minusDays(2))
        .setFriendUserIds(Arrays.asList(201, 202, 203, 204, 211, 212, 213, 214))
        .setVerified(true);

    User user2 = new User()
        .setId(1002)
        .setName("Bob")
        .setEmailAddress("bob@gmarket.com")
        .setCreatedAt(now.minusHours(10))
        .setFriendUserIds(Arrays.asList(204, 205, 206))
        .setVerified(false);

    User user3 = new User()
        .setId(1003)
        .setName("Charlie")
        .setEmailAddress("charlie@gmarket.com")
        .setCreatedAt(now.minusHours(1))
        .setFriendUserIds(Arrays.asList(204, 205, 207, 218))
        .setVerified(false);
    List<User> users = List.of(user1, user2, user3);

    Order order1 = new Order()
        .setId(1001L)
        .setAmount(BigDecimal.valueOf(4000))
        .setStatus(OrderStatus.CREATED);

    Order order2 = new Order()
        .setId(1002L)
        .setAmount(BigDecimal.valueOf(4000))
        .setStatus(OrderStatus.ERROR);

    Order order3 = new Order()
        .setId(1003L)
        .setAmount(BigDecimal.valueOf(3000))
        .setStatus(OrderStatus.ERROR);

    Order order4 = new Order()
        .setId(1004L)
        .setAmount(BigDecimal.valueOf(7000))
        .setStatus(OrderStatus.PROCESSED);

    List<Order> orders = Arrays.asList(order1, order2, order3, order4);


  }
}
