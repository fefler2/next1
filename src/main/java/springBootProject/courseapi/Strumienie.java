package springBootProject.courseapi;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strumienie {

    public static void main(String[] args) {

        List<Mieszkanie> list = Arrays.asList(
                new Mieszkanie("Wroclaw", "Psie Pole", "Ulica na Psim Polu",
                        3, 67.0f, true, 456000),

                new Mieszkanie("Wroclaw", "Krzyki", "Ulica na Krzykach",
                        2, 54.0f, false, 381000),

                new Mieszkanie("Warszawa", "Bialoleka", "Ulica w Bialolece",
                        4, 74.0f, false, 622000),

                new Mieszkanie("Poznan", "Dzielnia", "Ulica w Dzielnicy",
                        5, 84.0f, false, 901000)
        );

        list.forEach(o -> System.out.println(o));
        for (Mieszkanie m : list) {
            if (m.getMiasto().equals("Wroclaw")) {
                if (m.getPokoje() > 2) {
                    if (m.getCena() < 500000) {
                        System.out.println(m.getMiasto() + " " + m.getCena() + " " + m.getPokoje());
                    }
                }
            }
        }
        System.out.println();


        list.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equals("Wroclaw")).
                filter(mieszkanie -> mieszkanie.getPokoje() > 2).
                filter(mieszkanie -> mieszkanie.getCena() < 500000)
                .map(mieszkanie -> mieszkanie.getMiasto() + " " + mieszkanie.getCena()
                        + " " + mieszkanie.getPokoje()).forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equals("Wroclaw")).
                filter(mieszkanie -> mieszkanie.getPokoje() > 2).
                filter(mieszkanie -> mieszkanie.getCena() < 500000)
                .forEach(mieszkanie -> System.out.print(mieszkanie.getMiasto() + " " + mieszkanie.getCena()
                        + " " + mieszkanie.getPokoje()));

        System.out.println();

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        for (String name : names) {
            if (!name.equals("Sam")) {
                System.out.println(name);

            }
        }

        System.out.println();
//
        names.stream()
                .filter(s -> !s.equals("Sam")).forEach(s -> System.out.println(s));

        System.out.println();

        names.stream()
                .filter(s->!s.equals("Peter")).forEach(s-> System.out.println(s));



        System.out.println("Abc");
        System.out.println("CFD");




    }


}
