package Develhope_Exercise.OOP_Advanced._6;

public enum Days {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private Boolean isAWeekendDay;

    Days(Boolean isAWeekendDay) {
        this.isAWeekendDay = isAWeekendDay;
    }

    public Boolean getAWeekendDay() {
        return isAWeekendDay;
    }
}
