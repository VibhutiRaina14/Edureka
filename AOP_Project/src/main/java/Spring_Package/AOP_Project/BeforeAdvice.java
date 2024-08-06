package Spring_Package.AOP_Project;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
@EnableAspectJAutoProxy
public class BeforeAdvice {
	//execution(return_type package.class.method(..parameter_list)
	@Before("execution(* Spring_Package.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		//we can use jointPoint as parameter in advice method and using it get the method signature or the target object
		//we can use args expression in the pointcut to be applied to any method that matches arg pattern
		//if we use this, we need to use the same name in the advice method from where the arg type is determined
		System.out.println("Intercepted Method: "+ joinPoint);
		System.out.println("Arguments: "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	
	@Before("execution(* Spring_Package.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Intercepted Method: "+ joinPoint);
		System.out.println("Arguments: "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}

}
