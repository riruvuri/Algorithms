package threads.producer_consumer.reentrant_lock;


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
                locked = messageStream.getLock().tryLock(2, TimeUnit.SECONDS);

                while (messageStream.isFull()) {
                    messageStream.getConsumerCondition().await();
                }

                Message message = new Message(messageCtr++, "Test - ");
                messageStream.add(message);
                System.out.println("Produce: " + message.getMid());

                messageStream.getProducerCondition().signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if(locked) {
                    messageStream.getLock().unlock();
                    //System.out.println("Producer unlocked");
                }
            }
        }
    }
}
