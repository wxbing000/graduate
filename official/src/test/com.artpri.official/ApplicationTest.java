import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationTest {

    @Test
    public void testGetAction(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


    }

}
