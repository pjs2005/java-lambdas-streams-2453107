package com.example;

<<<<<<< Updated upstream
=======
import java.util.Random;
>>>>>>> Stashed changes
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {
    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = () -> System.out.println("Hello From Poojan");
    greeting2.sayHello();

<<<<<<< Updated upstream
    Calcuator calc = (int a, int b) -> a + b;
=======
    Greeting greeting3 = () -> System.out.println("Hello From here!");
    greeting3.sayHello();

    IntBinaryOperator calculator = (int x, int y) -> {
      int result = 0;
      Random random = new Random();
      result += random.nextInt(50) + (x * y);
      return result;

    };
    System.out.println(calculator.applyAsInt(1,2));



  }
>>>>>>> Stashed changes

    IntBinaryOperator calc2 = (int a, int b) -> a + b;

    System.out.println(calc.calucate(1,2));
    System.out.println(calc2.applyAsInt(1,2));

  }
}
