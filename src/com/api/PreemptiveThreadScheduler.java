package com.api;

public class PreemptiveThreadScheduler implements ThreadScheduler {

    @Override
    public void submit(Task task) {
        System.out.println("Submitting a task to PreemptiveThreadScheduler");
    }
}
