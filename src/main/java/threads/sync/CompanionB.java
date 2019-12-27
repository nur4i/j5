package threads.sync;

public class CompanionB implements Runnable {

    private Chat chat;
    private String[] texts = {"Hi", "I am good, what about you?", "Great!"};

    public CompanionB(Chat chat) {
        this.chat = chat;
        new Thread(this, "CompanionB").start();
    }

    public void run() {
        for (String text : texts) {
            chat.answer(Thread.currentThread().getName() + ": " + text);
        }
    }
}
