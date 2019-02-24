package springBootProject.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApplication {




    public static void main(String[] args) {

        SpringApplication.run(CourseApiApplication.class, args);

        TopicController topicController = new TopicController();
        topicController.getAllTopics();







    }

}
