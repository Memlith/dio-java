
import java.time.OffsetTime;

public class App {

    public static void main(String[] args) throws Exception {
        Clock brClock = new BRClock();
        brClock.setSecond(OffsetTime.now().getSecond());
        brClock.setMinute(OffsetTime.now().getMinute());
        brClock.setHour(OffsetTime.now().getHour());

        System.out.println(brClock.getTime());

        System.out.println(new USClock().convert(brClock).getTime());
    }
}
