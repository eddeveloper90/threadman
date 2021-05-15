/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 11:58 AM
 */
package com.play.threadman;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ThreadService {
    private Map<Integer, CustomThread> threadMap = new HashMap<>();

    public String info() {
        StringBuilder sb = new StringBuilder();
        return "";
    }

    public String add(String origin, String dest, int sleep) {
        CustomThread c = new CustomThread(origin, dest, sleep);
        c.start();
        this.threadMap.put(c.getJobId(), c);
        return "tid: " + c.getJobId();
    }

    public String rm(int threadId) {
        CustomThread c = this.threadMap.get(threadId);
        if (c == null)
            return "no thread!";

        c.setRunning(false);
        c.suspend();
        this.threadMap.remove(threadId);
        return String.format("thread %d removed.", threadId);
    }
}
