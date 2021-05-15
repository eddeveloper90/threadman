/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 11:58 AM
 */
package com.play.threadman;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ThreadService {
    private List<Thread> threadList = new LinkedList<>();

    public String info() {
        return "";
    }

    public void add() {
        this.threadList.add(new Thread());
    }
}
