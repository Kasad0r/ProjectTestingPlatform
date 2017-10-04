package MainController;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleController extends TimerTask {
    Date now;
    public void run() {
        now = new Date();
        System.out.println("Текущая дата и время: " + now);
    }
}
