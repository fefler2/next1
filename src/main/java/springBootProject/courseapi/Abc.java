package springBootProject.courseapi;

import org.springframework.boot.SpringApplication;

import javax.xml.parsers.SAXParser;

public class Abc {


    private void fizzBuzz(){

        String s = "";

        for (int i = 1; i < 101; i++) {

            if (i%5==0 && i%3==0) {

            }

            if (i%3==0 && i%5==0){
                s=("FizzBuzz");
            }
            else if (i%3==0){
                s=("Fizz");
            }
            else if (i%5==0){
                s=("Buzz");
            }
            else {
                s=String.valueOf(i);
            }

            System.out.println(s);
        }


    }


     void fizzBuzz2(){

        try {
            for (int i = 1; i < 101; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {


        System.out.println("abbc");

        Abc abc = new Abc();
        abc.fizzBuzz();

        SpringApplication springApplication = new SpringApplication();


    }
}
