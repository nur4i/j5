package threads.sync;

public class CompanionA implements Runnable {

    private Chat chat;
    private String[] texts = {"Hi", "How are you ?", "I am also doing fine!"};

    public CompanionA(Chat chat) {
        this.chat = chat;
        new Thread(this, "CompanionA").start();
    }

    public void run() {
        for (String text : texts) {
            chat.question(Thread.currentThread().getName() + ": " + text);
        }
    }
}
