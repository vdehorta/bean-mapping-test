package vdehorta.app;

/**
 * Created by VDehorta on 22/12/2015.
 */
public class Chrono {

    public static long chrono(long timeInMillisDebut, String message) {
        double timeInMillis = System.currentTimeMillis();
        double elapsedTimeInMillis = timeInMillis - timeInMillisDebut;
        double elapsedTimeInSeconds = elapsedTimeInMillis / (double) 1000;
        System.out.println(message + " - Durée (s) : " + elapsedTimeInSeconds);
        return System.currentTimeMillis();
    }

}
