/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 6:58 PM
 */
package com.play.threadman;

public class CustomThread extends Thread {
    private static int _ID = 1;
    private int jobId = _ID++;
    private int sleepSec = 0;
    private boolean running = true;
    private String originCode;
    private String destinationCode;

    public CustomThread(String originCode,
                        String destinationCode,
                        int sleepSec) {
        this.originCode = originCode;
        this.destinationCode = destinationCode;
        this.sleepSec = sleepSec;
    }

    @Override
    public void run() {
        super.run();
        while (running) {
            String message = String.format("API Call to flight from: %s to: %s", originCode, destinationCode);
            System.out.println(message);

            try {
                sleep(this.sleepSec * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
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
