
public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return this.periodIndicator;
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setHour(int hour) {
        if ((hour >= 12) && (hour <= 23)) {
            setAfterMidday();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            setBeforeMidday();
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRClock brClock ->
                this.setHour(brClock.getHour());
        }
        return this;
    }

}
