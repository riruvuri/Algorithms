package threads.producer_consumer.guava_monitor;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private MessageStream messageStream = null;

    Consumer(MessageStream messageStream) {
        this.messageStream = messageStream;
    }

    @Override
    public void run() {
        while(true) {
            try {
                //System.out.println("Consumer running: ");
                messageStream.getMonitor().enterWhen(messageStream.getConsumerGuard(), 2, TimeUnit.SECONDS);

                Message message = messageStream.remove();
                System.out.println("Consume: " + message.getMid());

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
