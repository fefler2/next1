package springBootProject.courseapi;

public class Debugowanie {


    public static void main(String[] args) {
        System.out.println("The program started");
        someFunction();


    }

    public static void someFunction(){
        Debugowanie2 debugowanie2 = new Debugowanie2();
        Debugowanie2 c = new Debugowanie2();

        c.otherFunction(5);

        System.out.println(
                "abc"
        );

        System.out.println("ds");
        System.out.println("w23");


    }

}
