package threads.producer_consumer.guava_monitor;

import com.google.common.util.concurrent.Monitor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MessageStream {
    private Monitor monitor;
    private Monitor.Guard producerGuard;
    private Monitor.Guard consumerGuard;

    private int maxSize;
    private final Queue<Message> queue = new LinkedList<>();

    MessageStream(int maxSize) {
        this.maxSize = maxSize;
        monitor = new Monitor();
        producerGuard = new Monitor.Guard(monitor) {
            @Override
            public boolean isSatisfied() {
                return !isFull();
            }
        };
        consumerGuard = new Monitor.Guard(monitor) {
            @Override
            public boolean isSatisfied() {
                return !isEmpty();
            }
        };
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor.Guard getProducerGuard() {
        return producerGuard;
    }

    public void setProducerGuard(Monitor.Guard producerGuard) {
        this.producerGuard = producerGuard;
    }

    public Monitor.Guard getConsumerGuard() {
        return consumerGuard;
    }

    public void setConsumerGuard(Monitor.Guard consumerGuard) {
        this.consumerGuard = consumerGuard;
    }

    public final boolean isFull() {
        return queue.size() == maxSize;
    }

    public final boolean isEmpty() {
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
