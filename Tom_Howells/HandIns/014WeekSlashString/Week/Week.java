class Week {
    private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public String getDay(int number) {
        return days[number - 1];
    }
}