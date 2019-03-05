package DesignPatterns.Strategy;

public class Duck {

    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

     int a=4;

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.a=5;



    }

}
