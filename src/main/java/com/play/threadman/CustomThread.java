/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 6:58 PM
 */
package com.play.threadman;

public class CustomThread extends Thread {
    private static long _ID = 1;
    private long jobId = _ID++;
    private boolean running = true;
    private String originCode;
    private String destinationCode;

    public CustomThread(String originCode,
                        String destinationCode) {
        this.originCode = originCode;
        this.destinationCode = destinationCode;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }
}
