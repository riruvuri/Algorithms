package threads.producer_consumer.synchronization;

public class Consumer implements Runnable {
    private final MessageStream messageStream;
    private volatile boolean runFlag;


    public Consumer(MessageStream messageStream) {
        this.messageStream = messageStream;
        runFlag = true;
    }

    @Override
    public void run() {
        consume();
    }

    private void consume() {
        // When to consume?
        // - Start consume only when the queue has elements
        // - How does it know when the queue is ready? Someone has to notify it right?
        // - How does it know from the producer that queue has items to consume?

        // Everything in action here
        while (runFlag) {
            System.out.println("Consumer Running");
            //synchronized (messageStream.START_PRODUCE) {
                while(messageStream.isEmpty()) {
                    try {
                        messageStream.waitOnConsume();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            //}


            if (!runFlag) {
                System.out.println("Consumer - Exiting");
                break;
            }

            Message message = messageStream.remove();
            System.out.println("Consumer: " + message.getMid());
            messageStream.notifyAllToStartProduction();
        }
    }

    public void stop() {
        while (!messageStream.isEmpty()) {
            System.out.println("Producer stopped - found items");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        runFlag = false;
        messageStream.notifyAllToStartConsumption();
    }
}