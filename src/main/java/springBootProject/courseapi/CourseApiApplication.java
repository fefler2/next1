package springBootProject.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class CourseApiApplication extends Thread{


    protected static boolean ifPalindrom(String s) {
        // s -> s2, ? s.equals(s2)

        String s2 = "";
        for (int i = s.length() -1; i >= 0; i--) {
            s2 += s.charAt(i);
        }

        return s.equals(s2);
    }


     int add(int a, int b){
        return a+b;
    }

    int multiply(int a, int b){
        return a*b;
    }




    Abc abc = new Abc();


    public static void main(String[] args) throws RuntimeException{

//        SpringApplication.run(CourseApiApplication.class, args);

        String s = "acad";
        System.out.println(ifPalindrom(s));

        List<Integer> list = new LinkedList<>();
        Set set = new HashSet();
        Map map = new HashMap();
        map.put(3,4);
        // ArrayList get() remove() O(1)
        // O(n)
        list.add(11);
        list.add(55);
        list.add(33);
        list.add(22);


        CourseApiApplication courseApiApplication = new CourseApiApplication();



        TopicController topicController = new TopicController();
        topicController.getAllTopics();


    }

}
