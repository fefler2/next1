package springBootProject.courseapi;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseApiApplicationTest {



    CourseApiApplication courseApiApplication;

    @BeforeClass
    void init(){

        CourseApiApplication courseApiApplication = new
                CourseApiApplication();


    }

    @Test
    void add() {
        CourseApiApplication courseApiApplication =
                new CourseApiApplication();

        assertEquals(5,courseApiApplication.add(2,3));
        assertEquals(22,courseApiApplication.add(22,0));
        assertEquals(22,courseApiApplication.add(44,-22));
    }

    @Test
    void multiply() {
        assertEquals(4,courseApiApplication.multiply(4,1));

    }

}