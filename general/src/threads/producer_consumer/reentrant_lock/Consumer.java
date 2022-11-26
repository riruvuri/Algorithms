package threads.producer_consumer.reentrant_lock;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private MessageStream messageStream = null;

    Consumer(MessageStream messageStream) {
        this.messageStream = messageStream;
    }

    @Override
    public void run() {
        while(true) {
            boolean locked = false;
            try {
                //System.out.println("Consumer running: ");
                locked = messageStream.getLock().tryLock(2, TimeUnit.SECONDS);

                while (messageStream.isEmpty()) {
                    messageStream.getProducerCondition().await();
                }

                Message message = messageStream.remove();
                System.out.println("Consume: " + message.getMid());

                messageStream.getConsumerCondition().signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if(locked) {
                    messageStream.getLock().unlock();
                    //System.out.println("Consumer unlocked");
                }
            }
        }
    }
}
