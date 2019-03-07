package springBootProject.courseapi;

public class ClassMath {

    int add(int a, int b){
        return a+b;
    }

    int multiply(int a, int b){
        return a*b;
    }

    int subtract(int a, int b){
        return a-b;
    }

    boolean isGreater(int a, int b){
        if (a>b){
            return true;
        }
        return false;
    }

    String greetings(){
        return "Hello World";
    }



    public static void main(String[] args) {




        Abc abc = new Abc();


        ClassMath classMath = new ClassMath();
        int a = classMath.add(2,3);
        System.out.println(a);


        System.out.println(new ClassMath().equals(new ClassMath()));
        System.out.println(new ClassMath() == new ClassMath());

        System.out.println(classMath.equals(abc));


    }

}
