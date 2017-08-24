package DaysOfWeek;

public enum DaysOfWeek {
    MONDAY(new String[]{"Monday", "Poniedziałek", "Montag"}),
    TUESDAY(new String[]{"Tuesday", "Wtorek", "Dienstag"}),
    WEDNESDAY(new String[]{"Wednesday", "Środa", "Mittwoch"}),
    THURSDAY(new String[]{"Thursday", "Czwartek", "Donnerstag"}),
    FRIDAY(new String[]{"Friday", "Piątek", "Freitag"}),
    SATURDAY(new String[]{"Saturday", "Sobota", "Samstag"}),
    SUNDAY(new String[]{"Sunday", "Niedziela", "Sonntag"});

    String[] day = new String[3];

    DaysOfWeek(String[] day){
        this.day = day;
    }

}
