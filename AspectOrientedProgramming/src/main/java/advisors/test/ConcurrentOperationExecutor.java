package advisors.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

public class ConcurrentOperationExecutor implements Ordered {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        Exception exception;
        do {
            numAttempts++;
            try {
                return pjp.proceed();
            }
            catch(Exception ex) {
                exception = ex;
            }
        } while(numAttempts <= this.maxRetries);
        throw exception;
    }

}