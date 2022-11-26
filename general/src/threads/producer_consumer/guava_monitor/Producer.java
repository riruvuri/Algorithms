package threads.producer_consumer.guava_monitor;


import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{
    private MessageStream messageStream;
    private int messageCtr;

    public Producer(MessageStream messageStream) {
        this.messageStream = messageStream;
    }

    @Override
    public void run() {
        while(true && messageCtr <=50) {
            boolean locked = false;
            try {
                messageStream.getMonitor().enterWhen(messageStream.getProducerGuard(), 2, TimeUnit.SECONDS);

                Message message = new Message(messageCtr++, "Test - ");
                messageStream.add(message);
                System.out.println("Produce: " + message.getMid());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (messageStream.getMonitor().isOccupiedByCurrentThread()) {
                    messageStream.getMonitor().leave();
                }
            }
        }
    }
}
