package threads.sequence_generator;

/*
Ref:
https://www.baeldung.com/java-mutex
 */
public class SequenceGenerator {
    private int currentValue;

    public int getNextSequence() {
        return currentValue++;
    }
}
