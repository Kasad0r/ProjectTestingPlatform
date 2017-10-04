package MainController;

import org.apache.commons.math3.random.RandomGenerator;

import java.util.Timer;
import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) {
        Integer ing = 5;
        String str = "d";
        System.out.println("test");
        Timer time = new Timer();
        ScheduleController sc = new ScheduleController();
        time.schedule(sc,0,1000);
        Main main = new Main();
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Execution in Main Thread. #" + i);
            if (i == 5) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
    }
    public int cout(int a , int b){
        return a+b;
    }
    public Integer add(Object x){
        if(x instanceof Integer){

        }else if(x instanceof String){

        }else return 0;
    return 0;
    }
}

