package springBootProject.courseapi;


import java.util.*;



abstract class Calc {
    int f;

    abstract int dod(int a, int b);
}


abstract class Calc2 {
    int f;

    abstract int dod(int a, int b);
}


@FunctionalInterface
interface KalkulatorInterface {
    int oblicz(int a, int b);
//    int odejmowanie(int a, int b);


}

public class Lambda {


    private String string1;

    public static void main(String[] args) {


        KalkulatorInterface dodaj = (a, b) -> a + b;
        KalkulatorInterface odejmij = (a, b) -> a - b;

        KalkulatorInterface pomnoz = (a, b) -> a * b;

        KalkulatorInterface podziel = (a, b) -> a / b;

        KalkulatorInterface k = new KalkulatorInterface() {
            @Override
            public int oblicz(int a, int b) {
                return a + b;
            }
        };

        KalkulatorInterface calc = (a, b) -> a + b;


        System.out.println(dodaj.oblicz(3, 4));


        // ^ - operator bitowy


        List<String> list = new ArrayList();
        list.add("ab");
        list.add("cd");
        list.add("ff");
        list.add("fd");


        list.forEach(s -> System.out.print(s + s));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        Collections.sort(list);

        System.out.println();


        System.out.println(odejmij.oblicz(3,2));

    }


}



