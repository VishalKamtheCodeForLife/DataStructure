package com.example.department;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddNumber {
    private static Object object=new Object();

    private static IntPredicate evenCond=e-> e%2==0;
    private static IntPredicate oddCond=e-> e%2!=0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->EvenOddNumber.printNumber(evenCond));
        CompletableFuture.runAsync(()->EvenOddNumber.printNumber(oddCond));
        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition).forEach(EvenOddNumber::Execute);
    }

    private static void Execute(int i) {
    synchronized (object){
        try {
            System.out.println(Thread.currentThread().getName()+ " : "+i);
            object.notify();
            object.wait();
        }catch(InterruptedException e){
             e.printStackTrace();
        }
    }
    }
}
