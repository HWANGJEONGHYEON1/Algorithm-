package future;

import java.util.concurrent.CompletionStage;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " start");
        thenAccept();
//        thenAcceptAsync();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " finish");

    }

    private static void thenAcceptAsync() throws InterruptedException {
        CompletionStage<Integer>  runningStage = Helper.runningStage();
        runningStage.thenAcceptAsync(i -> {
            System.out.println(Thread.currentThread().getName() + " 1 :" + i );
        }).thenAcceptAsync(i -> {
            System.out.println(Thread.currentThread().getName() + " 2 :" + i );
        });
    }

    private static void thenAccept() throws InterruptedException {

        CompletionStage<Integer> integerCompletionStage = Helper.runningStage();
        integerCompletionStage.thenAccept(i -> {
            System.out.println(Thread.currentThread().getName() + " 1 :" + i );
        }).thenAccept(i -> {
            System.out.println(Thread.currentThread().getName() + " 2 :" + i );
        });
    }

    private static void finishThenAcceptAsync() throws InterruptedException {


        CompletionStage<Integer>  runningStage = Helper.finishedStage();
        runningStage.thenAcceptAsync(i -> {
            System.out.println(Thread.currentThread().getName() + " i :" + i );
        }).thenAcceptAsync(i -> {
            System.out.println(Thread.currentThread().getName() + " i :" + i );
        });
    }

    private static void finishThenAccept() throws InterruptedException {

        CompletionStage<Integer> integerCompletionStage = Helper.finishedStage();
        integerCompletionStage.thenAccept(i -> {
            System.out.println(Thread.currentThread().getName() + " i :" + i );
        }).thenAccept(i -> {
            System.out.println(Thread.currentThread().getName() + " i :" + i );
        });
    }
}
