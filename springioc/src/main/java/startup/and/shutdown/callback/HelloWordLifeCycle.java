package startup.and.shutdown.callback;

import org.springframework.context.Lifecycle;

public class HelloWordLifeCycle implements Lifecycle {
    private boolean isRunning = false;
    public HelloWordLifeCycle() {
        System.out.println("构造方法");
    }
    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
        System.out.println("Lifecycle start");
        isRunning = true;
    }

    public void stop() {
        System.out.println("Lifecycle stop");
        isRunning = false;
    }

}
