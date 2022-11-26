package threads.producer_consumer.guava_monitor;


public class Message {
    private int mid;

    private String text;

    public Message(int mid, String text) {
        this.mid = mid;
        this.text = text;
    }
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
