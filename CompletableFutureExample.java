package com.example.department;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(()-> ("Complete"));
        String future= completableFuture.get();
        System.out.println(future);
    }
}