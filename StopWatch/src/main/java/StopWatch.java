import java.time.LocalTime;

class StopWatch{
    private LocalTime startTime;
    private LocalTime endTime;
    public StopWatch(){
        this.startTime=java.time.LocalTime.now();
    }
    public LocalTime start(){
        return this.startTime=java.time.LocalTime.now();
    }
    public LocalTime stop() {
        return this.endTime=java.time.LocalTime.now();
    }

    public LocalTime getStartTime(){
        return this.startTime=java.time.LocalTime.now();
    }
    public LocalTime getEndTime(){
        return this.endTime=java.time.LocalTime.now();
    }
    public long getElapsedTime(){
        long millis=System.currentTimeMillis();
        return millis;
    }

}