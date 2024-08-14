package org.example;

import java.util.Optional;
import javax.swing.text.html.Option;
import org.example.object.order.User;

public class OptionalPractice {
  public static void main(String[] args) {
//    User user1 = new User()
//        .setId(1001)
//        .setName("Alice")
//        .setVerified(false);
//
//    User user2 = new User()
//        .setId(1001)
//        .setName("Alice")
//        .setEmailAddress("alice@gmarket.com")
//        .setVerified(false);
//
////    System.out.println(userEquals(user2, user1));
//
////    String someEmail = "some@email.com";
////    String nullEmail = null;
////
////    Optional<String> maybeEmail = Optional.of(someEmail);
////    Optional<String> maybeEmail2 = Optional.empty();
////    Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
////    Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);
////
////    String defaultEmail = "default@email.com";
////    String email = maybeEmail3.orElseThrow(()-> new RuntimeException("test"));
////
////    System.out.println(email);
//
//    Optional<String> s = Optional.ofNullable(maybeGetUser(true))
//        .flatMap(User::getEmailAddress);
//
//    s.ifPresent(System.out::println);

  }
  private static User maybeGetUser(boolean returnUser) {
    if (returnUser) {
      return new User()
          .setId(1001)
          .setName("Alice")
          .setEmailAddress("alice@gmarket.com")
          .setVerified(false);
    }
    return null;
  }

  private static boolean userEquals(User u1, User u2) {
    return u1.getId() == u2.getId() &&
        u1.getName().equals(u2.getName()) &&
        u1.getEmailAddress().equals(u2.getEmailAddress()) &&
        u1.isVerified() && u2.isVerified();
  }
}
