package ifs;

public class SportTest {

    public static void main(String[] args) {
        Football f = new Football();

        Football s = new Football();
        Hockey h = new Hockey();

        Event e = new Football();

        printStats(s);
        printStats(h);


        System.out.println("Players count " + getSport().getPlayersCount());
        System.out.println(s);
    }

    public static void printStats(Sport f) {
        System.out.println(f.getPlayersCount());
        System.out.println(f.getPeriods());
    }

    public static Hockey getSport() {
        return new Hockey();
    }

}
