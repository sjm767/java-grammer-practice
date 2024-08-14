package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class SamplePractice {

  static ReentrantLock lock = new ReentrantLock();

  public static void main(String[] args) {

    Thread thread = new Thread(() -> {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("test");
    });

    thread.start();

    try {
      lock.lock();
      thread.wait();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } finally {
      lock.unlock();
    }

    System.out.println("test");

  }
}
