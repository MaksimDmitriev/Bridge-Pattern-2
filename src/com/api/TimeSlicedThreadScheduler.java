package com.api;

public class TimeSlicedThreadScheduler implements ThreadScheduler {

    @Override
    public void submit(Task task) {
        System.out.println("Submitting a task to TimeSlicedThreadScheduler");
    }
}
