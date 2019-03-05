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

    public static void main(String[] args) {

        ClassMath classMath = new ClassMath();
        int a = classMath.add(2,3);
        System.out.println(a);

    }

}
