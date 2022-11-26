package threads.producer_consumer.synchronization;

public class Producer implements Runnable {
    private final MessageStream messageStream;
    private volatile boolean runFlag;
    private int messageCtr;


    public Producer(MessageStream messageStream) {
        this.messageStream = messageStream;
        runFlag = true;
    }

    @Override
    public void run() {
        produce();
    }

    private void produce() {
        // When to produce?
        // - Start produce only when the queue is empty
        // - How does it know when the queue is empty? Someone has to notify it right?
        // - How does it inform the consumer that queue has items to consume?

        // Everything in action here
        while (runFlag) {
            //synchronized (messageStream.STOP_PRODUCE) {
                while (messageStream.isFull()) {
                    try {
                        messageStream.waitOnProduce();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            //}

            if (!runFlag) {
                break;
            }

            Message message = new Message(messageCtr++, "Test - ");
            messageStream.add(message);
            System.out.println("Producer: " + message.getMid());
            messageStream.notifyAllToStartConsumption();
        }
    }

    public void stop() {
        runFlag = false;
        messageStream.notifyAllToStartConsumption();
    }
}
