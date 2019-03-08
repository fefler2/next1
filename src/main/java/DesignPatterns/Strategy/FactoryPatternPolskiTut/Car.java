package DesignPatterns.Strategy.FactoryPatternPolskiTut;

public class Car {
    public String getColor() {
        return color;
    }


    private String color;

    public static class Builder {
        private String color;

        public Builder(){

        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public static void main(String[] args) {
            System.out.println("abc");

        }

    }

//    public Car returnS(){
//        System.out.println();
//        return this;
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Car car = new Car();
//        System.out.println(car.returnS());
//        System.out.println(car.returnS());
//
//    }
}
