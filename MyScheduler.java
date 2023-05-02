import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduler {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(new MyTask(), 0, 5, TimeUnit.SECONDS);
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
                System.out.println("Hello World!");
            }
        
    }
}
