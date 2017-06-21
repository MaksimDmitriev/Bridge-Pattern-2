package com.client;

import com.api.PreemptiveThreadScheduler;
import com.api.Task;
import com.api.ThreadSchedulerImpl;
import com.api.jvm.JvmThreadSchedulerImpl;

public class Main {

    public static void main(String[] args) {
        ThreadSchedulerImpl threadSchedulerImpl = new JvmThreadSchedulerImpl(new PreemptiveThreadScheduler());
        threadSchedulerImpl.submit(new Task());
    }
}
