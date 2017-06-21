package com.api;

public class ThreadSchedulerImpl {

    private ThreadScheduler threadScheduler;

    public ThreadSchedulerImpl(ThreadScheduler threadScheduler) {
        this.threadScheduler = threadScheduler;
    }

    public void submit(Task task) {
        threadScheduler.submit(task);
    }
}
