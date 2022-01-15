package Java.enumexamples;

public class Basic {

    enum Week {
        Monday,Tuesday,Wednesday,Thrusday,Friday,Staurday,Sunday
    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;
        System.out.println(week);

        for (Week day:
                Week.values()
             ) {
            System.out.println(day);
        }

        System.out.println(week.ordinal());
        // ordinal returns the position of that particular item
    }
}
