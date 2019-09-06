import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBuzzTest {

    JavaBuzz javabuzz;

    @Before
    public void setUpJavaBuzz(){
        javabuzz = new JavaBuzz();
    }

    @After
    public void deleteJavaBuzz(){
        javabuzz = null;
    }

    @Test
    public void returnsJava() {
        String res = javabuzz.javaBuzz(3);
        assertEquals("Java", res);
    }
    @Test
    public void returnsBuzz() {
        String res = javabuzz.javaBuzz(5);
        assertEquals("Buzz", res);
    }
    @Test
    public void returnsJavaBuzz(){
        String res = javabuzz.javaBuzz(15);
        assertEquals("JavaBuzz", res);
    }
    @Test
    public void returnsSelf(){
        String res = javabuzz.javaBuzz(11);
        assertEquals("11", res);
    }
}
