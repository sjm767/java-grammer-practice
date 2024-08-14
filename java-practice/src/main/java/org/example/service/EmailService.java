package org.example.service;

import org.example.object.order.User;

public class EmailService {

  public void sendPlayWithFriendsEmail(User user){
    user.getEmailAddress()
        .ifPresent(email -> System.out.println("sending 'Play with Friends' email to " + email));
  }

  public void sendMakeMoreFriendEmail(User user){
    user.getEmailAddress()
        .ifPresent(email -> System.out.println("sending 'Make More Friends' email to " + email));
  }

  public void sendVerifyYourEmailEmail(User user) {
    user.getEmailAddress()
        .ifPresent(email -> System.out.println("Sending 'Verify Your Email' email to " + email));
  }

}
