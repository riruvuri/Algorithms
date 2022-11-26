package threads.producer_consumer.guava_monitor;

import org.junit.Test;

/*
Ref: https://www.waitingforcode.com/google-guava/google-guava-concurrency/read

 */
public class DataSyncTest {
    @Test
    public void data_transfer_test() {
        MessageStream messageStream = new MessageStream(10);
        Consumer consumer = new Consumer(messageStream);
        Producer producer = new Producer(messageStream);
        Thread consumerThread = new Thread(consumer);
        Thread producerThread = new Thread(producer);
        consumerThread.start();
        producerThread.start();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
