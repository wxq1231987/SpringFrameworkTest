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
    @Pointcut("execution(* aspect.test.*.introduce(..))")
    public void introducePoint() {
        
    }
    @Pointcut("execution(* aspect.test.*.showGratitude(..))")
    public void gratitudePoint() {
        
    }
    @Before("introducePoint() && args(account)")
    public void beforeIntroduce(Account account) {
        System.out.println(account.getName() + "开始自我介绍");
    }
    @Before("dancePoint()")
    public void beforeDance() {
        //System.out.println("开始入座");
    }
    @Before("gratitudePoint() && args(track, account)")
    public void beforeGratitude(Track track, Account account) {
        System.out.println(track.getName() + "表演完毕");
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
