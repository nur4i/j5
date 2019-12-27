package ifs;

import java.util.Date;

public class Football implements Sport, Event {


    public int getPlayersCount() {
        return 22;
    }

    public int getPeriods() {
        return 2;
    }

    public String getType() {
        return "football";
    }

    public double getPayment() {
        return 22;
    }

    public Date getStartDate() {
        return new Date();
    }

    @Override
    public String toString() {
        return "Football";
    }
}
