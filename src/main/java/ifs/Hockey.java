package ifs;

public class Hockey implements Sport {
    public int getPlayersCount() {
        return 10;
    }

    public int getPeriods() {
        return 3;
    }

    @Override
    public String toString() {
        return "Hockey";
    }
}
