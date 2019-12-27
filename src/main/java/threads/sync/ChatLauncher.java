package threads.sync;

public class ChatLauncher {

    public static void main(String[] args) {
        Chat m = new Chat();
        new CompanionA(m);
        new CompanionB(m);
    }
}
