package Develhope_Exercise.OOP_Advanced._6;

public enum Seasons {
    Spring("21 March - 21 June"),
    Summer("22 June - 22 September"),
    Fall("23 September - 22 December"),
    Winter("23 December - 20 March");

    private String MonthsRange;

    Seasons(String monthsRange) {
        this.MonthsRange = monthsRange;
    }
    public String getMonthsRange() {
        return MonthsRange;
    }
}
