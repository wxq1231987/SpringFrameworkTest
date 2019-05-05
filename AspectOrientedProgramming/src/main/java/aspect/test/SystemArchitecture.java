package aspect.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemArchitecture {
    @Pointcut("execution(* aspect.test.*.performance(..))")
    public void dancePoint() {
        
    }
    @Pointcut("execution(* aspect.test.*.getTrack())")
    public void getTrackPoint() {
        
    }
    @Before("dancePoint()")
    public void beforeDance() {
        //System.out.println("开始入座");
    }
    @After("dancePoint()")
    public void afterDance() {
        //System.out.println("鼓掌");
    }
    @Around("dancePoint()")
    public void aroundDance(ProceedingJoinPoint pjp) {
        System.out.println("开始入座");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("鼓掌");
    }
    @AfterReturning(pointcut="getTrackPoint()", returning="retVal")
    public void afterGetTrack(Object retVal) {
        if (retVal instanceof Track) {
            System.out.println("成功获取到了曲目信息, " + retVal.toString());
        }
    }
}
