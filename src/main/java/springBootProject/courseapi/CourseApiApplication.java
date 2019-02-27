package springBootProject.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApplication {


    private static boolean ifPalindrom(String s) {
        // s -> s2, ? s.equals(s2)

        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }

        return s.equals(s2);
    }

    public static void main(String[] args) {

        SpringApplication.run(CourseApiApplication.class, args);

        String s = "acad";
        System.out.println(ifPalindrom(s));

        TopicController topicController = new TopicController();
        topicController.getAllTopics();


    }

}
