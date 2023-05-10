package future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class Helper {

    public static CompletionStage<Integer> finishedStage() throws InterruptedException {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "===> : supplyAsync");
            return 1;
        });
        Thread.sleep(100);
        return future;
    }

    public static CompletionStage<Integer> runningStage() throws InterruptedException {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "===> : im running");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        });
    }
}
