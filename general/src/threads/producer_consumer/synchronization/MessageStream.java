package threads.producer_consumer.synchronization;

import java.util.LinkedList;
import java.util.Queue;

public class MessageStream {
    private final Queue<Message> queue = new LinkedList<>();
    private int maxSize;

    public MessageStream(int maxSize) {
        this.maxSize = maxSize;
    }

    // Producer need to check if the queue is full, then wait for the queue to get empty
    public final Object STOP_PRODUCE = new Object();

    // Consumer need to check if there are items in the queue, notify the producer to start producing
    public final Object START_PRODUCE = new Object();

    public void waitOnProduce() throws InterruptedException {
        synchronized (STOP_PRODUCE) {
            STOP_PRODUCE.wait();
        }
    }

    public void notifyAllToStartProduction() {
        synchronized (STOP_PRODUCE) {
            STOP_PRODUCE.notifyAll();
        }
    }

    public void waitOnConsume() throws InterruptedException {
        synchronized (START_PRODUCE) {
            START_PRODUCE.wait();
        }
    }

    public void notifyAllToStartConsumption() {
        synchronized (START_PRODUCE) {
            START_PRODUCE.notifyAll();
        }
    }

    public boolean isFull() {
        return queue.size() == maxSize;
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void add(Message message) {
        synchronized (queue) {
            queue.add(message);
        }
    }

    public Message remove() {
        synchronized (queue) {
            return queue.poll();
        }
    }
}
