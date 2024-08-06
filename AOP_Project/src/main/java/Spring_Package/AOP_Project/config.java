package Spring_Package.AOP_Project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="Spring_Package")
@EnableAspectJAutoProxy
public class config {

}
