package threads.producer_consumer.synchronization;

/*
Ref: https://www.baeldung.com/java-producer-consumer-problem

https://programming.guide/java/why-wait-must-be-in-synchronized.html

 */
public class DataSyncTest {

    public static void main(String[] args) {
        MessageStream messageStream = new MessageStream(1);
        Producer producer = new Producer(messageStream);
        //new Thread(producer).start();

        Consumer consumer = new Consumer(messageStream);
        //new Thread(consumer).start();

        for (int i = 0; i < 12; i++) {
            Thread producerThread = new Thread(producer);
            producerThread.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        producer.stop();
        System.out.println("Producer stopped");
        consumer.stop();

    }
}
