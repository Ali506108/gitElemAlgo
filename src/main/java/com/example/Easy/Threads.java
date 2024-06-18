package com.example.Easy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threads {

    public static void main(String[] args) {

        /*int num = 20;

        Thread t1 = new Thread(()  -> {
            System.out.println("Thread 1: " + num);
            for (int i = 0; i <= num ; i++) {
                System.out.println("Thread i : " + i);
            }
        });

        t1.start();*/

        /*ExecutorService sub = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            sub.submit(() -> {
                System.out.println("Thread: " + Thread.currentThread().getName());
            });
        }
        sub.shutdown();*/

        CompletableFuture.supplyAsync(() ->{
            System.out.println("Thread " + Thread.currentThread().getName());
            return "Aser";
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        }).exceptionally(ex ->{
            System.out.println("Error: " + ex.getMessage());
            return null;
        });

    }
}
