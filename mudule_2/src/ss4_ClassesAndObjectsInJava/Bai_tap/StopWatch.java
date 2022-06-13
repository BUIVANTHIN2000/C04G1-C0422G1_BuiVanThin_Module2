package ss4_ClassesAndObjectsInJava.Bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void startTime() {
        this.startTime = new Date();
    }

    public void stopTime() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.startTime();
        System.out.println("Start time: " + time.getStartTime());

        for(long i = 0L; i < 100000L; ++i) {
            ++i;
        }

        time.stopTime();
        System.out.println("end Time: " + time.getEndTime());
        System.out.println("total Time: " + time.getElapsedTime());
    }
}
