package jdbc_gyak.activitytracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;

    private List<TrackPoint> trackPoints = new ArrayList<>();

    // ha adatbázisból akarjuk lekérdezni, az ott lévő adatokat kell példányosítani (id-t is)
    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    // activity beszúrásakor példányosítani kell, de id-t az adatbázis generálja
    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public void addTrackPoints(List<TrackPoint> trackPoints) {
        this.trackPoints.addAll(trackPoints);
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                ", trackPoints=" + trackPoints +
                '}';
    }
}
