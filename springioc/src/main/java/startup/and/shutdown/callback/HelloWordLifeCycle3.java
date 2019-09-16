package startup.and.shutdown.callback;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

public class HelloWordLifeCycle3 implements SmartLifecycle {

    public boolean isRunning() {
        // TODO Auto-generated method stub
        return false;
    }

    public void start() {
        System.out.println("LifeCycle3 start");
    }

    public void stop() {
        System.out.println("LifeCycle3 stop");
    }

    public int getPhase() {
        return 1;
    }

    public boolean isAutoStartup() {
        return true;
    }

    public void stop(Runnable arg0) {
        // TODO Auto-generated method stub
        
    }

}
