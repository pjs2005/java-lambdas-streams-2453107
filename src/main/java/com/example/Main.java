package com.example;

import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {
    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = () -> System.out.println("Hello From Poojan");
    greeting2.sayHello();

    Calcuator calc = (int a, int b) -> a + b;

    IntBinaryOperator calc2 = (int a, int b) -> a + b;

    System.out.println(calc.calucate(1,2));
    System.out.println(calc2.applyAsInt(1,2));

  }
}
