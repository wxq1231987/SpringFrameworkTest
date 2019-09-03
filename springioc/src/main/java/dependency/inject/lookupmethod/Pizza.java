package dependency.inject.lookupmethod;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
    private AtomicLong count = new AtomicLong();
    private boolean veggie;
    private Pizza() {
        count.incrementAndGet();
    }
    public AtomicLong getCount() {
        return count;
    }
    public void setVeggie(boolean veggie) {
        this.veggie = veggie;
    }
    @Override
    public String toString() {
        return "Pizza [count=" + count + ", isVeg=" + veggie + "]";
    }
}
