package springBootProject.courseapi;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


import static org.junit.jupiter.api.Assertions.*;

class ClassMathTest {

    ClassMath classMath;

    @BeforeEach
     void init() {

        classMath = new ClassMath();

    }

    @Test
    void add() {
        assertEquals(5, classMath.add(2, 3));
    }



    @Test
    void subtract(){
        assertEquals(3,classMath.subtract(4,1));
    }




    @Test
    void isGreater() {
        assertEquals(true,classMath.isGreater(4,3));
        assertTrue(classMath.isGreater(3,2));

        assertFalse(classMath.isGreater(3,4));
        assertFalse(classMath.isGreater(3,22));



    }

    @Test
    void greetings(){

        assertEquals("Hello World", classMath.greetings());


    }

    @Test
    void object(){

//        assertSame(classMath, classMath);
        assertNotEquals(new ClassMath(), new ClassMath());
    }

    @Test
    void multiply() {
        assertEquals(22, classMath.multiply(2,11));
    }
}