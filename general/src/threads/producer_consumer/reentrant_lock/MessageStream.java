package threads.producer_consumer.reentrant_lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MessageStream {
    private Lock lock;
    private Condition producerCondition;
    private Condition consumerCondition;

    private int maxSize;

    private final Queue<Message> queue = new LinkedList<>();

    MessageStream(int maxSize) {
        this.maxSize = maxSize;
        lock = new ReentrantLock();
        producerCondition = lock.newCondition();
        consumerCondition = lock.newCondition();
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Condition getProducerCondition() {
        return producerCondition;
    }

    public void setProducerCondition(Condition producerCondition) {
        this.producerCondition = producerCondition;
    }

    public Condition getConsumerCondition() {
        return consumerCondition;
    }

    public void setConsumerCondition(Condition consumerCondition) {
        this.consumerCondition = consumerCondition;
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
