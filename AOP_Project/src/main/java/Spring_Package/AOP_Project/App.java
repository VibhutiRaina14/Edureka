package Spring_Package.AOP_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext app1=new AnnotationConfigApplicationContext(config.class);
        MovieRepositoryClass m=app1.getBean(MovieRepositoryClass.class);
        m.add("Movie1");
    }
}
