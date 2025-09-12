public class SequenceNumber {
    private long sequenceIndex;
    private long sequenceValue;

    public SequenceNumber(long sequenceIndex, long sequenceValue) {
        this.sequenceIndex = sequenceIndex;
        this.sequenceValue = sequenceValue;
    }

    public long getSequenceIndex(){
        return sequenceIndex;
    }

    public long getSequenceValue(){
        return sequenceValue;
    }

    @Override
    public String toString() {
        return String.format("%d ", sequenceValue);
    }
}
