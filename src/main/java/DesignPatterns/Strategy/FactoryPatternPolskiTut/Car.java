package DesignPatterns.Strategy.FactoryPatternPolskiTut;

public class Car {
    private Car(Builder builder) {
        this.color  = builder.color;
    }

    public String getColor() {
        return color;
    }


    private String color;

    public static class Builder {
        private String color;



        public Builder color(String color){
            this.color = color;
            return this;
        }

        
        public Car build(){
            return new Car(this);
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
