package ch10.exercises.timespan;

public class TimeSpan implements Comparable<TimeSpan> {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }

        this.hours += hours;
        this.minutes += minutes;

        // converts each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

        public String toString() {
        return hours + "h " + minutes + "m";
    }


    public int compareTo(TimeSpan other) {
        // check hours
        if (this.hours > other.hours) {
            return 1;
        } else if (this.hours < other.hours) {
            return -1;
        } else {
            // check minutes
            if (this.minutes > other.minutes) {
                return 1;
            } else if (this.minutes < other.minutes) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
