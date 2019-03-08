package DesignPatterns.Strategy.FactoryPatternPolskiTut;

public class Client {
    public static void main(String[] args) {

        Car car =
                new Car.Builder().color("red").build();
    }
}
