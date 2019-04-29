package aspect.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemArchitecture {
    @Pointcut("execution(* aspect.test.Performance+.performance(..))")
    public void dancePoint() {
        
    }
    @Before("dancePoint()")
    public void beforeDance() {
        System.out.println("开始入座");
    }
    @After("dancePoint()")
    public void afterDance() {
        System.out.println("鼓掌");
    }
}
