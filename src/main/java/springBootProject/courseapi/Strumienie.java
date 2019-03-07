package springBootProject.courseapi;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strumienie {

    public static void main(String[] args) {

        List list = Arrays.asList(
                new Mieszkanie("Wroclaw", "Psie Pole", "Ulica na Psim Polu",
                        3, 67.0f, true,  456000),

                new Mieszkanie("Wroclaw", "Krzyki", "Ulica na Krzykach",
                        2, 54.0f, false,  381000),

                new Mieszkanie("Wroclaw", "Bialoleka", "Ulica w Bialolece",
                        4, 74.0f, false,  622000),

                new Mieszkanie("Wroclaw", "Dzielnia", "Ulica w Dzielnicy",
                        5, 84.0f, false,  901000)
        );




    }
}
